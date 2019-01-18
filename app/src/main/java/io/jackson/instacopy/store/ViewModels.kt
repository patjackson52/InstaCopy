package io.jackson.instacopy.store

import androidx.annotation.ColorRes

import java.util.*


data class InstacartViewModel(val storeHeaderViewModel: StoreHeaderViewModel)

data class StoreHeaderViewModel(val title: String,
                                val subTitle: String,
                                val imageUrl: String,
                                val bckgrndImageUrl: String,
                                val withInTime: String,
                                val moreInfoString: String,
                                val searchText: String)


data class InfoCardViewModel(val bckgrndImageUrl: String,
                             val infoIconImageUrl: String,
                             val title: String,
                             @ColorRes val tintColor: Int,
                             val subTitle: String)

data class FreeDeliveryCardViewModel(val bckgrndImageUrl: String,
                                     val title: String,
                                     val subTitle: String,
                                     val storeIcons: List<StoreIcon>)

data class StoreIcon(val iconUrl: String,
                     val name: String)

data class Item(val imageUrl: String,
                val discountPrice: String? = null,
                val priceOrg: String,
                val discount: String? = null,
                val name: String,
                val quantity: String,
                val id: String = UUID.randomUUID().toString()) {
    companion object {
        const val PLACE_HOLDER_ID = "<place_holder>"
        val PLACE_HOLDER = Item("", null, "", "", "", "", PLACE_HOLDER_ID)
    }
}

data class ItemCarouselViewModel(
        val title: String,
        val items: List<Item>): ListItemViewModel() {
    override fun areContentsTheSame(other: Any): Boolean {
        if (other is ItemCarouselViewModel) {
            items.forEachIndexed { index, item ->
                if (item != other.items[index]) {
                    return false
                }
            }
        }
        return super.areContentsTheSame(other)
    }
}

open class ListItemViewModel {
    open fun areContentsTheSame(other: Any): Boolean {
        return this.equals(other)
    }
}