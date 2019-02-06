package io.jackson.instacopy

import com.beyondeye.reduks.Action
import io.jackson.instacopy.repo.*

sealed class Actions : Action {
    data class FetchStoreInfoAction(val storeId: String)
    data class FetchStoreInfoSuccessAction(val storeInfoResponse: StoreInfoResponse)
    data class FetchStoreInfoFailureAction(val message: String)

    data class FetchSuggestionsAction(val storeId: String)
    data class FetchSuggestionsSuccessAction(val suggestions: ItemsResponse)
    data class FetchSuggestionsFailureAction(val message: String)

    data class FetchFreeDeliveriesAction(val storeId: String)
    data class FetchFreeDeliveriesSuccess(val response: FreeDeliveryResponse)
    data class FetchFreeDeliveriesFailure(val message: String)

    data class FetchBrandItemsAction(val storeId: String)
    data class FetchBrandItemsSuccessAction(val response: ItemsResponse)
    data class FetchBrandItemsFailureAction(val message: String)

    data class FetchCouponsAction(val storeId: String)
    data class FetchCouponsSuccessAction(val response: CouponResponse)
    data class FetchCouponsFailureAction(val message: String)

    class FetchStoreFeedLoadingAction
    data class FetchStoreFeedSuccessAction(val response: Map<String, FeedType>)
    data class FetchStoreFeedFailureAction(val message: String)

    data class AddToCartAction(val itemId: String)
    data class RemoveFromCartAction(val itemId: String)

    data class OpenQuantityPickerAction(val itemId: String)
}