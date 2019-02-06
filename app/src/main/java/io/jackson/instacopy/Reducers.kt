package io.jackson.instacopy

import com.beyondeye.reduks.ReducerFn
import io.jackson.instacopy.Actions.*

val reducer = ReducerFn<AppState> { state, action ->
    when (action) {
        is FetchStoreFeedSuccessAction -> {
            state.copy(listData = action.response.values.toList(),
                    loadingStoreFeed = false)
        }
        is FetchStoreInfoSuccessAction -> {
            state.copy(storeInfoResponse = action.storeInfoResponse,
                    loadingStoreInfo = false)
        }
        is FetchStoreFeedLoadingAction -> state.copy(loadingStoreFeed = true)

        is AddToCartAction -> incrementCartForItem(state, action.itemId)

        is OpenQuantityPickerAction -> incrementCartForItem(state, action.itemId)

        is RemoveFromCartAction -> {
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

fun incrementCartForItem(state: AppState, itemId: String): AppState {
    val items = if (state.cart.items.containsKey(itemId)) {
        state.cart.items.plus(Pair(itemId, state.cart.items[itemId]!! + 1))
    } else {
        state.cart.items.plus(Pair(itemId, 1))
    }
    return state.copy(cart = state.cart.copy(items = items))
}