package io.jackson.common.repo

import io.jackson.common.StoreIcon
import kotlinx.coroutines.CoroutineScope
import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable


interface StoreRepository {
    suspend fun storeFeed(storeId: String, coroutineScope: CoroutineScope): GatewayResponse<Map<String, Any>, GenericError>
    suspend fun storeInfo(storeId: String, coroutineScope: CoroutineScope): GatewayResponse<StoreInfoResponse, GenericError>
}


//@Serializable
//sealed class FeedType

@Serializable
data class ItemsResponse(val title: String,
                         val items: List<Item>)

@Serializable
data class DeliveryOptionsResponse(val address: String,
                                   val time: String)

@Serializable
data class Item(val imageUrl: String,
                @Optional
                val discountPrice: String? = null,
                val priceOrg: String,
                @Optional
                val discount: String? = null,
                val name: String,
                val quantity: String,
                val id: String = name) {
    companion object {
        const val PLACE_HOLDER_ID = "<place_holder>"
    }
}

@Serializable
data class FreeDeliveryResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val storeIcons: List<StoreIcon>
)

@Serializable
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

@Serializable
data class CouponResponse(
        val title: String,
        val subTitle: String,
        val bckgndImageUrl: String,
        val infoIconImageUrl: String
)

class NoResponse


