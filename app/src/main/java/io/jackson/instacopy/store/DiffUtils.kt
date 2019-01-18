package io.jackson.instacopy.store

import androidx.recyclerview.widget.DiffUtil

class StoreDiffUtilCallback(private val oldItems: MutableList<Any>, private val newItems: MutableList<Any>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val isSame = oldItems[oldItemPosition] === newItems[newItemPosition]
        return isSame
    }

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val contentsAreSame = oldItems[oldItemPosition] == newItems[newItemPosition]
        return contentsAreSame
    }
}

class ItemCarouselDiffUtilCallback(private val oldItems: MutableList<Item>, private val newItems: MutableList<Item>) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition].id == newItems[newItemPosition].id
    }

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition] == newItems[newItemPosition]
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return isQuantityChanged(oldItems[oldItemPosition], newItems[newItemPosition])
    }

    private fun isQuantityChanged(oldItem: Item, newItem: Item): Boolean {
        return oldItem.numInCart != newItem.numInCart
    }
}
