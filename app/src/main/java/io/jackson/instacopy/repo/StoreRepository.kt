package io.jackson.instacopy.repo

import com.squareup.moshi.JsonClass
import io.jackson.instacopy.store.Item
import io.jackson.instacopy.store.ItemCarouselViewModel
import io.jackson.instacopy.store.StoreIcon

interface StoreRepository {
    fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError>
    fun suggestions(storeId: String): GatewayResponse<ItemsResponse, GenericError>
    fun freeDeliveries(storeId: String): GatewayResponse<FreeDeliveryResponse, GenericError>
    fun brandItems(storeId: String): GatewayResponse<ItemsResponse, GenericError>
    fun coupons(storeId: String): GatewayResponse<CouponResponse, GenericError>
}

@JsonClass(generateAdapter = true)
data class ItemsResponse(val title: String,
                         val items: List<Item>)


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
