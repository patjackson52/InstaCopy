package io.jackson.instacopy.store

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.store.carousel.CarouselItemAdapter
import kotlinx.android.synthetic.main.item_carousel.view.*
import androidx.recyclerview.widget.DefaultItemAnimator
import io.jackson.instacopy.middleware.ViewEffectsMiddleware


class CarouselViewHolder(view: View) : BindingViewHolderWithAdapter<ItemCarouselViewModel>(view) {



    private fun viewEffectsSucriber(viewEffect: ViewEffect): Unit {
        when (viewEffect) {
            is ShowPickerViewEffect ->
                itemView.carouselRecyclerView.adapter?.notifyItemChanged(getPositionForItem(viewEffect.itemId), viewEffect)
        }

    }
    fun getPositionForItem(itemId: String): Int {
        return (itemView.carouselRecyclerView.adapter as CarouselItemAdapter).data.indexOfFirst { it.item.id == itemId }
    }

    fun detachedFromWindow() {
        ViewEffectsMiddleware.unsubscribe(this::viewEffectsSucriber)
    }

    override fun bindViews(data: ItemCarouselViewModel, cachedAdapter: RecyclerView.Adapter<*>?) {
        ViewEffectsMiddleware.subscribeToViewEffects(this::viewEffectsSucriber)
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


}