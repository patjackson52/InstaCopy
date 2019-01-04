package io.jackson.instacopy.store.carousel

import android.view.View
import io.jackson.instacopy.store.BindingViewHolder
import io.jackson.instacopy.store.FreeDeliveryCardViewModel
import kotlinx.android.synthetic.main.item_free_delivery_title.view.*

class FreeDeliveryTitleHolder(view: View) : BindingViewHolder<FreeDeliveryCardViewModel>(view) {
    override fun bindViews(data: FreeDeliveryCardViewModel) {
        with(itemView) {
            txt_free_delivery_title.text = data.title
            txt_free_delivery_subtitle.text = data.subTitle
        }
    }
}