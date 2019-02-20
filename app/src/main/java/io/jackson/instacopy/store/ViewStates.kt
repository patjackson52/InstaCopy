package io.jackson.instacopy.store

import androidx.annotation.ColorRes
import io.jackson.instacopy.repo.Item
import io.jackson.instacopy.repo.Item.Companion.PLACE_HOLDER_ID


data class StoreHeaderViewState(val title: String,
                                val subTitle: String,
                                val imageUrl: String,
                                val bckgrndImageUrl: String,
                                val withInTime: String,
                                val moreInfoString: String,
                                val searchText: String)

data class DeliveryOptionViewState(
        val address: String,
        val time: String
)

data class InfoCardViewState(val bckgrndImageUrl: String,
                             val infoIconImageUrl: String,
                             val title: String,
                             @ColorRes val tintColor: Int,
                             val subTitle: String)

data class FreeDeliveryCardViewState(val bckgrndImageUrl: String,
                                     val title: String,
                                     val subTitle: String,
                                     val storeIcons: List<StoreIcon>)

data class StoreIcon(val iconUrl: String,
                     val name: String)


data class ItemViewState(val numInCart: Int, val item: Item) {

    companion object {
        val PLACE_HOLDER = ItemViewState(0,Item("", null, "", "", "", "", PLACE_HOLDER_ID))
    }
}

data class ItemCarouselViewState(
        val title: String,
        val items: List<ItemViewState>) : ListItemViewState() {
    override fun areContentsTheSame(other: Any): Boolean {
        if (other is ItemCarouselViewState) {
            items.forEachIndexed { index, item ->
                if (item != other.items[index]) {
                    return false
                }
            }
        }
        return super.areContentsTheSame(other)
    }
}

open class ListItemViewState {
    open fun areContentsTheSame(other: Any): Boolean {
        return this.equals(other)
    }
}