package io.jackson.instacopy.store

import android.view.View
import kotlinx.android.synthetic.main.item_delivery_selector.view.*

class DeliverySelectorHolder(view: View): BindingViewHolder<DeliveryOptionViewState>(view) {

    override fun bindViews(data: DeliveryOptionViewState) {
        itemView.txt_address.text = data.address
        itemView.txt_time.text = data.time
        itemView.btn_selection.setOnClickListener {  }
    }

}