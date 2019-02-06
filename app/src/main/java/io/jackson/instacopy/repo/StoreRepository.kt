package io.jackson.instacopy.repo

import com.squareup.moshi.JsonClass
import io.jackson.instacopy.store.StoreIcon


interface StoreRepository {
    fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError>
    fun storeFeed(storeId: String): GatewayResponse<Map<String, FeedType>, GenericError>
}

sealed class FeedType
@JsonClass(generateAdapter = true)
data class ItemsResponse(val title: String,
                         val items: List<Item>): FeedType()

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
): FeedType()

@JsonClass(generateAdapter = true)
data class StoreInfoResponse(
        val title: String,
        val subTitle: String,
        val imageUrl: String,
        val bckgndImageUrl: String,
        val withInTime: String,
        val moreInfoString: String,
        val searchText: String
) {
    companion object {
        val LOADING = StoreInfoResponse("","","","","","", "")
    }
}

@JsonClass(generateAdapter = true)
data class CouponResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val infoIconImageUrl: String
): FeedType()

class NoResponse(): FeedType()

//@JsonClass(generateAdapter = true)
//data class StoreFeedResponse(
//        val items: Map<String, Any>
//):ApiResponse()

@JsonClass(generateAdapter = true)
data class Carousel(
    val items: List<Item>,
    val numItems: Int,
    val title: String
) {
    companion object {
        val LOADING = Carousel(items = listOf(),
                numItems = -1,
                title = "")
    }
}

@JsonClass(generateAdapter = true)
data class Promos(
        val coupons: CouponResponse,
        val freeDelivery: FreeDeliveryResponse
)

