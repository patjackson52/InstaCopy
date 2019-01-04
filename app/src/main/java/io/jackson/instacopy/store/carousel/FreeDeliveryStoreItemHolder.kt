package io.jackson.instacopy.store.carousel

import android.view.View
import io.jackson.instacopy.GlideApp
import io.jackson.instacopy.store.BindingViewHolder
import io.jackson.instacopy.store.StoreIcon
import kotlinx.android.synthetic.main.item_free_delivery_store.view.*

class FreeDeliveryStoreItemHolder(view: View) : BindingViewHolder<StoreIcon>(view) {
    override fun bindViews(data: StoreIcon) {
        GlideApp.with(itemView.context)
                .load(data.iconUrl)
                .circleCrop()
                .into(itemView.imgStoreIcon)

    }

}