package io.jackson.instacopy.repo

import com.squareup.moshi.JsonClass
import io.jackson.instacopy.store.StoreIcon
import java.util.*


interface StoreRepository {
    fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError>
    fun suggestions(storeId: String): GatewayResponse<ItemsResponse, GenericError>
    fun freeDeliveries(storeId: String): GatewayResponse<FreeDeliveryResponse, GenericError>
    fun brandItems(storeId: String): GatewayResponse<ItemsResponse, GenericError>
    fun coupons(storeId: String): GatewayResponse<CouponResponse, GenericError>
}

sealed class ApiResponse
@JsonClass(generateAdapter = true)
data class ItemsResponse(val title: String,
                         val items: List<Item>): ApiResponse()

data class Item(val imageUrl: String,
                val discountPrice: String? = null,
                val priceOrg: String,
                val discount: String? = null,
                val name: String,
                val quantity: String,
                val id: String = name) {
    companion object {
        const val PLACE_HOLDER_ID = "<place_holder>"
        val PLACE_HOLDER = Item("", null, "", "", "", "", PLACE_HOLDER_ID)
    }
}


@JsonClass(generateAdapter = true)
data class FreeDeliveryResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val storeIcons: List<StoreIcon>
): ApiResponse()

@JsonClass(generateAdapter = true)
data class StoreInfoResponse(
        val title: String,
        val subTitle: String,
        val imageUrl: String,
        val bckgndImageUrl: String,
        val withInTime: String,
        val moreInfoString: String,
        val searchText: String
): ApiResponse()

@JsonClass(generateAdapter = true)
data class CouponResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val infoIconImageUrl: String
): ApiResponse()

class NoResponse(): ApiResponse()
