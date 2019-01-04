package io.jackson.instacopy.store.carousel

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.store.Item
import io.jackson.instacopy.R

class CarouselItemAdapter : RecyclerView.Adapter<CarouselItemViewHolder>() {
    var data: MutableList<Item> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselItemViewHolder {
        return CarouselItemViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false))
    }

    override fun getItemCount() = data.size

    override fun getItemViewType(position: Int): Int {
        return when (data[position].id) {
            Item.PLACE_HOLDER_ID -> R.layout.item_carousel_placeholder
            else -> R.layout.item_carousel_item
        }
    }

    override fun onBindViewHolder(holder: CarouselItemViewHolder, position: Int) {
        holder.bindViews(data[position])
    }

    fun runLayoutAnimation(recyclerView: RecyclerView) {
        val context = recyclerView.context
        val controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fade_in)

        recyclerView.layoutAnimation = controller
        recyclerView.adapter!!.notifyDataSetChanged()
        recyclerView.scheduleLayoutAnimation()
    }
}