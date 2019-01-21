package io.jackson.instacopy

import com.beyondeye.reduks.ReducerFn

val reducer = ReducerFn<AppState> { state, action ->
    when (action) {
        is Actions.FetchStoreInfoSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[0] = action.storeInfoResponse
            state.copy(listData = newListData)
        }
        is Actions.FetchCouponsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[1] = action.response
            state.copy(listData = newListData)
        }
        is Actions.FetchSuggestionsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[2] = action.suggestions
            state.copy(listData = newListData)
        }
        is Actions.FetchFreeDeliveriesSuccess -> {
            val newListData = state.listData.toMutableList()
            newListData[3] = action.response
            state.copy(listData = newListData)
        }
        is Actions.FetchBrandItemsSuccessAction -> {
            val newListData = state.listData.toMutableList()
            newListData[4] = action.response
            state.copy(listData = newListData)
        }
        is Actions.AddToCartAction -> incrementCartForItem(state, action.itemId)
        is Actions.OpenQuantityPickerAction -> incrementCartForItem(state, action.itemId)
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

fun incrementCartForItem(state: AppState, itemId: String): AppState {
    val items = if (state.cart.items.containsKey(itemId)) {
        state.cart.items.plus(Pair(itemId, state.cart.items[itemId]!! + 1))
    } else {
        state.cart.items.plus(Pair(itemId, 1))
    }
    return state.copy(cart = state.cart.copy(items = items))
}