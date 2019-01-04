package io.jackson.instacopy.store.carousel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.store.FreeDeliveryCardViewModel
import io.jackson.instacopy.R
import java.lang.IllegalArgumentException

class FreeDeliveryItemAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var data: FreeDeliveryCardViewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return when (viewType) {
            R.layout.item_free_delivery_title -> FreeDeliveryTitleHolder(view)
            R.layout.item_free_delivery_store -> FreeDeliveryStoreItemHolder(view)
            else -> throw IllegalArgumentException("Viewtype $viewType not handled")
        }
    }

    override fun getItemCount() = data.storeIcons.size + 1

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> R.layout.item_free_delivery_title
            else -> R.layout.item_free_delivery_store
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (position) {
            0 -> (holder as FreeDeliveryTitleHolder).bindViews(data)
            else -> (holder as FreeDeliveryStoreItemHolder).bindViews(data.storeIcons[position - 1])
        }
    }

}