package io.jackson.instacopy.store.carousel

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.jackson.instacopy.R
import io.jackson.instacopy.repo.Item
import io.jackson.instacopy.store.ItemCarouselDiffUtilCallback
import io.jackson.instacopy.store.ItemViewState

class CarouselItemAdapter : RecyclerView.Adapter<CarouselItemViewHolder>() {
    var data: MutableList<ItemViewState> = mutableListOf()

    init {
        setHasStableIds(true)
    }

    fun setItems(data: MutableList<ItemViewState>) {
        val diffResult = DiffUtil.calculateDiff(ItemCarouselDiffUtilCallback(this.data, data))
        diffResult.dispatchUpdatesTo(this)
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselItemViewHolder {
        return CarouselItemViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false))
    }

    override fun getItemCount() = data.size

    override fun getItemId(position: Int): Long {
        return position.toLong()//BigInteger(data[position].item.id.toByteArray(Charset.defaultCharset())).toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return when (data[position].item.id) {
            Item.PLACE_HOLDER_ID -> R.layout.item_carousel_placeholder
            else -> R.layout.item_carousel_item
        }
    }

    override fun onBindViewHolder(holder: CarouselItemViewHolder, position: Int) {
        holder.bindViews(data[position], null)
    }

    override fun onBindViewHolder(holder: CarouselItemViewHolder, position: Int, payloads: MutableList<Any>) {
        holder.bindViews(data[position], payloads)
    }


    fun runLayoutAnimation(recyclerView: RecyclerView) {
        val context = recyclerView.context
        val controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fade_in)

        recyclerView.layoutAnimation = controller
        recyclerView.adapter!!.notifyDataSetChanged()
        recyclerView.scheduleLayoutAnimation()
    }
}