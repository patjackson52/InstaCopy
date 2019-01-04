package io.jackson.instacopy.store

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.*
import io.jackson.instacopy.store.carousel.FreeDeliveryCardViewHolder


class StoreRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var data = mutableListOf<Any>()
    private var lastPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return when (viewType) {
            R.layout.item_store_header -> HeaderViewHolder(view)
            R.layout.item_info_card -> InfoCardViewHolder(view)
            R.layout.item_carousel -> CarouselViewHolder(view)
            R.layout.item_free_delivery_card -> FreeDeliveryCardViewHolder(view)
            else -> throw AssertionError("onCreateViewHolder not implemented for viewType: $viewType")
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderViewHolder -> holder.bindViews(data[position] as StoreHeaderViewModel)
            is InfoCardViewHolder -> holder.bindViews(data[position] as InfoCardViewModel)
            is CarouselViewHolder -> holder.bindViews(data[position] as ItemCarouselViewModel)
            is FreeDeliveryCardViewHolder -> holder.bindViews(data[position] as FreeDeliveryCardViewModel)
        }
        setAnimation(holder.itemView, position)
    }

    override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
            is StoreHeaderViewModel -> R.layout.item_store_header
            is InfoCardViewModel -> R.layout.item_info_card
            is ItemCarouselViewModel -> R.layout.item_carousel
            is FreeDeliveryCardViewModel -> R.layout.item_free_delivery_card
            else -> throw AssertionError("type not specified")
        }
    }


    fun setListData(data: MutableList<Any>) {
        this.data = data
        notifyDataSetChanged()
    }

    private fun setAnimation(viewToAnimate: View, position: Int) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            val animation = AnimationUtils.loadAnimation(viewToAnimate.context, android.R.anim.fade_in)
            viewToAnimate.startAnimation(animation)
            lastPosition = position
        }
    }
}


