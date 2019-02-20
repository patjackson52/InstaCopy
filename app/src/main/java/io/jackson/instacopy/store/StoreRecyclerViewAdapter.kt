package io.jackson.instacopy.store

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.*
import io.jackson.instacopy.store.carousel.CarouselItemAdapter
import io.jackson.instacopy.store.carousel.FreeDeliveryCardViewHolder


class StoreRecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var data = mutableListOf<Any>()
    private var lastPosition = -1
    private var nestedAdapters = mutableMapOf<Int, RecyclerView.Adapter<*>>()

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return when (viewType) {
            R.layout.item_store_header -> HeaderViewHolder(view)
            R.layout.item_delivery_selector -> DeliverySelectorHolder(view)
            R.layout.item_info_card -> InfoCardViewHolder(view)
            R.layout.item_carousel -> CarouselViewHolder(view)
            R.layout.item_free_delivery_card -> FreeDeliveryCardViewHolder(view)
            else -> throw AssertionError("onCreateViewHolder not implemented for viewType: $viewType")
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    private fun getNestedAdapter(position: Int): RecyclerView.Adapter<*> {
        return if (nestedAdapters.containsKey(position)) {
            nestedAdapters[position]!!
        } else {
            val newAdapter = CarouselItemAdapter()
            nestedAdapters[position] = newAdapter
            newAdapter
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderViewHolder -> holder.bindViews(data[position] as StoreHeaderViewModel)
            is DeliverySelectorHolder -> holder.bindViews(data[position] as DeliveryOptionViewModel)
            is InfoCardViewHolder -> holder.bindViews(data[position] as InfoCardViewModel)
            is CarouselViewHolder -> holder.bindViews(data[position] as ItemCarouselViewModel, getNestedAdapter(position))
            is FreeDeliveryCardViewHolder -> holder.bindViews(data[position] as FreeDeliveryCardViewModel)
        }
//        setAnimation(holder.itemView, position)
    }

    override fun getItemViewType(position: Int): Int {
        return when (data[position]) {
            is StoreHeaderViewModel -> R.layout.item_store_header
            is DeliveryOptionViewModel -> R.layout.item_delivery_selector
            is InfoCardViewModel -> R.layout.item_info_card
            is ItemCarouselViewModel -> R.layout.item_carousel
            is FreeDeliveryCardViewModel -> R.layout.item_free_delivery_card
            else -> throw AssertionError("type not specified")
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    fun setListData(data: MutableList<Any>) {
        val diffResult = DiffUtil.calculateDiff(StoreDiffUtilCallback(data, this.data))
        diffResult.dispatchUpdatesTo(this)
        this.data = data
    }

    override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {
        when (holder) {
            is CarouselViewHolder -> {
                holder.detachedFromWindow()
            }
        }
        super.onViewDetachedFromWindow(holder)
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


