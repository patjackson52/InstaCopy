package io.jackson.instacopy

import com.beyondeye.reduks.*
import com.beyondeye.reduks.middlewares.ThunkMiddleware
import com.beyondeye.reduks.middlewares.applyMiddleware
import io.jackson.instacopy.boundary.toViewModel
import io.jackson.instacopy.repo.*
import io.jackson.instacopy.store.ItemCarouselViewModel
import io.jackson.instacopy.store.StoreHeaderViewModel
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

data class AppState(val listData: MutableList<Any>,
                    val cart: Cart) {
    companion object {
        val INITIAL_STATE = AppState(listData = mutableListOf(
                StoreHeaderViewModel("Loading", "Loading", "", "", "", "", ""),
                testItemCarouselPlaceholder,
                testItemCarouselPlaceholder,
                testItemCarouselPlaceholder,
                testItemCarouselPlaceholder
        ),
                cart = Cart(mapOf()))
    }
}

/*
 * Items in cart is map of itemId to quantity in user's cart.
 */
data class Cart(val items: Map<String, Int>) {
    fun contains(itemId: String) = items.contains(itemId)
}

val reducer = ReducerFn<AppState> { state, action ->
    when (action) {
        is Actions.FetchStoreInfoSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[0] = action.storeInfoResponse.toViewModel()
            state.copy(listData = newListData)
        }
        is Actions.FetchCouponsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[1] = action.response.toViewModel()
            state.copy(listData = newListData)
        }
        is Actions.FetchSuggestionsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[2] = action.suggestions.toViewModel()
            state.copy(listData = newListData)
        }
        is Actions.FetchFreeDeliveriesSuccess -> {
            val newListData = state.listData.toMutableList()
            newListData[3] = action.response.toViewModel()
            state.copy(listData = newListData)
        }
        is Actions.FetchBrandItemsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[4] = action.response.toViewModel()
            state.copy(listData = newListData)
        }
        is Actions.AddToCartAction -> {
            val items = if (state.cart.items.containsKey(action.itemId)) {
                state.cart.items.plus(Pair(action.itemId, state.cart.items[action.itemId]!! + 1))
            } else {
                state.cart.items.plus(Pair(action.itemId, 1))
            }
            val carouselItemViewModel = (state.listData[4] as ItemCarouselViewModel)
            val oldCarouselViewModel = (state.listData[4] as ItemCarouselViewModel).items.find { it.id == action.itemId }!!
            val newList = carouselItemViewModel.items.toMutableList()
//            newList[newList.indexOf(oldCarouselViewModel)] = newCarouselViewModel

//            state.listData[4] = carouselItemViewModel.copy(items = newList)
            state.copy(cart = state.cart.copy(items = items))
        }
        is Actions.RemoveFromCartAction -> {
            val items = if (state.cart.items.containsKey(action.itemId) && state.cart.items[action.itemId]!! > 0) {
                state.cart.items.plus(Pair(action.itemId, state.cart.items[action.itemId]!! - 1))
            } else {
                state.cart.items.plus(Pair(action.itemId, 0))
            }
            state.copy(cart = state.cart.copy(items = items))
        }

        else -> throw AssertionError("Action ${action::class.java.simpleName} not handled")
    }
}


object NetworkThunks : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

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

val appStore = SimpleStore(AppState.INITIAL_STATE, reducer).applyMiddleware(ThunkMiddleware())

class Actions : Action {
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

    data class AddToCartAction(val itemId: String)
    data class RemoveFromCartAction(val itemId: String)
}
