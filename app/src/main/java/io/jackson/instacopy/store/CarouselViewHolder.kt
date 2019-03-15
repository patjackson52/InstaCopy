package io.jackson.instacopy.store

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.store.carousel.CarouselItemAdapter
import kotlinx.android.synthetic.main.item_carousel.view.*
import androidx.recyclerview.widget.DefaultItemAnimator
import io.jackson.common.ItemCarouselViewState
import io.jackson.common.ShowPickerViewEffect
import io.jackson.common.ViewEffect
import io.jackson.common.middleware.ViewEffectsMiddleware
import io.jackson.common.viewEffectsMiddleware


class CarouselViewHolder(view: View) : BindingViewHolderWithAdapter<ItemCarouselViewState>(view) {

    override fun bindViews(data: ItemCarouselViewState, cachedAdapter: RecyclerView.Adapter<*>?) {
        viewEffectsMiddleware.subscribeToViewEffects(this::viewEffectsSubscriber)
        itemView.txtCarouselTitle.text = data.title
        itemView.carouselRecyclerView.apply {
            val animator = object : DefaultItemAnimator() {
                override fun canReuseUpdatedViewHolder(viewHolder: RecyclerView.ViewHolder): Boolean {
                    return true
                }
            }
            itemAnimator = animator
            if (layoutManager == null) {
                layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                adapter = cachedAdapter
                (adapter as CarouselItemAdapter).setItems(data.items.toMutableList())
                (adapter as CarouselItemAdapter).runLayoutAnimation(this)
            } else {
                swapAdapter(cachedAdapter, false)
                (adapter as CarouselItemAdapter).setItems(data.items.toMutableList())
            }
        }
    }

    private fun viewEffectsSubscriber(viewEffect: ViewEffect): Unit {
        when (viewEffect) {
            is ShowPickerViewEffect ->
                itemView.carouselRecyclerView.adapter?.notifyItemChanged(getPositionForItem(viewEffect.itemId), viewEffect)
        }

    }
    private fun getPositionForItem(itemId: String): Int {
        return (itemView.carouselRecyclerView.adapter as CarouselItemAdapter).data.indexOfFirst { it.item.id == itemId }
    }

    fun detachedFromWindow() {
        viewEffectsMiddleware.unsubscribe(this::viewEffectsSubscriber)
    }
}