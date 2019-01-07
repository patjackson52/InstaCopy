package io.jackson.instacopy.repo

import com.squareup.moshi.JsonClass
import io.jackson.instacopy.store.Item
import io.jackson.instacopy.store.ItemCarouselViewModel
import io.jackson.instacopy.store.StoreIcon

interface StoreRepository {
    fun storeInfo(storeId: String): StoreInfoResponse
    fun suggestions(storeId: String): ItemsResponse
    fun freeDeliveries(storeId: String): FreeDeliveryResponse
    fun brandItems(storeId: String): ItemsResponse
    fun coupons(storeId: String): CouponResponse
}

@JsonClass(generateAdapter = true)
data class ItemsResponse(val title: String,
                         val items: List<Item>)

fun ItemsResponse.toViewModel() = ItemCarouselViewModel(
        title = title,
        items = items
)

@JsonClass(generateAdapter = true)
data class FreeDeliveryResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val storeIcons: List<StoreIcon>
)

@JsonClass(generateAdapter = true)
data class StoreInfoResponse(
        val title: String,
        val subTitle: String,
        val imageUrl: String,
        val bckgndImageUrl: String,
        val withInTime: String,
        val moreInfoString: String,
        val searchText: String
)

@JsonClass(generateAdapter = true)
data class CouponResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val infoIconImageUrl: String
)
