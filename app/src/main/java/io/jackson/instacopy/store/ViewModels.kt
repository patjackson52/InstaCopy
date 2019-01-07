package io.jackson.instacopy.store

import androidx.annotation.ColorRes
import io.jackson.instacopy.R
import io.jackson.instacopy.repo.CouponResponse
import io.jackson.instacopy.repo.FreeDeliveryResponse
import io.jackson.instacopy.repo.StoreInfoResponse
import java.util.*


data class InstacartViewModel(val storeHeaderViewModel: StoreHeaderViewModel)

fun StoreInfoResponse.toViewModel() = StoreHeaderViewModel(
        title = title,
        subTitle = subTitle,
        imageUrl = imageUrl,
        bckgrndImageUrl = bckgndImageUrl,
        withInTime = withInTime,
        moreInfoString = moreInfoString,
        searchText = searchText
)

data class StoreHeaderViewModel(val title: String,
                                val subTitle: String,
                                val imageUrl: String,
                                val bckgrndImageUrl: String,
                                val withInTime: String,
                                val moreInfoString: String,
                                val searchText: String)

fun CouponResponse.toViewModel() = InfoCardViewModel(
        bckgrndImageUrl = bckgndImageUrl,
        infoIconImageUrl = infoIconImageUrl,
        title = title,
        subTitle = subTitle,
        tintColor = R.color.infoCardYellow
)

data class InfoCardViewModel(val bckgrndImageUrl: String,
                             val infoIconImageUrl: String,
                             val title: String,
                             @ColorRes val tintColor: Int,
                             val subTitle: String)

data class FreeDeliveryCardViewModel(val bckgrndImageUrl: String,
                                     val title: String,
                                     val subTitle: String,
                                     val storeIcons: List<StoreIcon>)

fun FreeDeliveryResponse.toViewModel() = FreeDeliveryCardViewModel(
        bckgrndImageUrl = bckgndImageUrl,
        title = title,
        subTitle = subTitle,
        storeIcons = storeIcons
)

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
        val items: List<Item>)