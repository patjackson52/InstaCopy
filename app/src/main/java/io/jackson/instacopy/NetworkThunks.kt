package io.jackson.instacopy

import com.beyondeye.reduks.*
import io.jackson.instacopy.repo.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

object NetworkThunks : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    fun fetchStoreFeed(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.storeFeed(storeId)
                if (result.isSuccessful) {
                    Actions.FetchStoreFeedSuccessAction(result.response!!)
                } else {
                    Actions.FetchStoreFeedFailureAction(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }

    fun fetchStoreInfoThunk(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.storeInfo(storeId)
                if (result.isSuccessful) {
                    Actions.FetchStoreInfoSuccessAction(result.response!!)
                } else {
                    Actions.FetchStoreInfoFailureAction(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }

    fun fetchSuggestionsThunk(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.suggestions(storeId)
                if (result.isSuccessful) {
                    Actions.FetchSuggestionsSuccessAction(result.response!!)
                } else {
                    Actions.FetchSuggestionsFailureAction(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }


    fun fetchFreeDeliveries(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.freeDeliveries(storeId)
                if (result.isSuccessful) {
                    Actions.FetchFreeDeliveriesSuccess(result.response!!)
                } else {
                    Actions.FetchFreeDeliveriesFailure(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }

    fun fetchBrandItems(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.brandItems(storeId)
                if (result.isSuccessful) {
                    Actions.FetchBrandItemsSuccessAction(result.response!!)
                } else {
                    Actions.FetchBrandItemsFailureAction(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }

    fun fetchCoupons(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            val action = withContext(Dispatchers.Default) {
                val result = RetrofitStoreRepository.coupons(storeId)
                if (result.isSuccessful) {
                    Actions.FetchCouponsSuccessAction(result.response!!)
                } else {
                    Actions.FetchCouponsFailureAction(result.message!!)
                }
            }
            appStore.dispatch(action)
        }
    }
}
