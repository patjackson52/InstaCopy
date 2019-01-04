package io.jackson.instacopy.store

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import io.jackson.instacopy.store.carousel.CarouselItemAdapter
import kotlinx.android.synthetic.main.item_carousel.view.*

class CarouselViewHolder(view: View) : BindingViewHolder<ItemCarouselViewModel>(view) {

    override fun bindViews(data: ItemCarouselViewModel) {
        itemView.txtCarouselTitle.text = data.title
        itemView.carouselRecyclerView.apply {
            layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CarouselItemAdapter().apply {
                this.data = data.items.toMutableList()
            }
            (adapter as CarouselItemAdapter).runLayoutAnimation(this)
        }
    }

}