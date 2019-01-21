package io.jackson.instacopy.store

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import io.jackson.instacopy.Cart
import io.jackson.instacopy.store.carousel.CarouselItemAdapter
import kotlinx.android.synthetic.main.item_carousel.view.*
import androidx.recyclerview.widget.DefaultItemAnimator


class CarouselViewHolder(view: View) : BindingViewHolderWithAdapter<ItemCarouselViewModel>(view) {

    override fun bindViews(data: ItemCarouselViewModel, cachedAdapter: RecyclerView.Adapter<*>?) {
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
//                adapter = cachedAdapter
                swapAdapter(cachedAdapter, false)
                (adapter as CarouselItemAdapter).setItems(data.items.toMutableList())
            }
        }
    }

}