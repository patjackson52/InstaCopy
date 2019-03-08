package io.jackson.common

import com.beyondeye.reduks.Action
import io.jackson.common.repo.FeedType
import io.jackson.common.repo.StoreInfoResponse

sealed class Actions : Action {
    data class FetchStoreInfoAction(val storeId: String)
    data class FetchStoreInfoSuccessAction(val storeInfoResponse: StoreInfoResponse)
    data class FetchStoreInfoFailureAction(val message: String)

    class FetchStoreFeedLoadingAction
    data class FetchStoreFeedSuccessAction(val response: Map<String, FeedType>)
    data class FetchStoreFeedFailureAction(val message: String)

    data class AddToCartAction(val itemId: String)
    data class RemoveFromCartAction(val itemId: String)

    data class OpenQuantityPickerAction(val itemId: String)
}