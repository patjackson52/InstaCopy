package io.jackson.instacopy.store

import androidx.recyclerview.widget.DiffUtil
import io.jackson.instacopy.store.carousel.CarouselItemChangePayload

class StoreDiffUtilCallback(private val oldItems: MutableList<Any>, private val newItems: MutableList<Any>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return if (oldItems[oldItemPosition] is List<*>) {
            (oldItems[oldItemPosition] as List<*>).toTypedArray().contentDeepEquals((newItems[newItemPosition] as List<*>).toTypedArray())
        } else {
            val isSame = oldItems[oldItemPosition] == newItems[newItemPosition]
            isSame
        }
    }

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val contentsAreSame = oldItems[oldItemPosition] == newItems[newItemPosition]
        return contentsAreSame
    }
}

class ItemCarouselDiffUtilCallback(private val oldItems: MutableList<ItemViewModel>, private val newItems: MutableList<ItemViewModel>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val areItemsTheSame = oldItems[oldItemPosition].item.id == newItems[newItemPosition].item.id
        return areItemsTheSame
    }

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val areContentsTheSame = oldItems[oldItemPosition] == newItems[newItemPosition]
        return areContentsTheSame
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        val hasQuantityChanted = isQuantityChanged(oldItems[oldItemPosition], newItems[newItemPosition])
        return if (hasQuantityChanted) {
            CarouselItemChangePayload(true)
        } else {
            CarouselItemChangePayload(false)
        }
    }

    private fun isQuantityChanged(oldItem: ItemViewModel, newItem: ItemViewModel): Boolean {
        return oldItem.numInCart != newItem.numInCart
    }
}
