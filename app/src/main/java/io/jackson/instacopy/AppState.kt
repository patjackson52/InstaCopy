package io.jackson.instacopy

import com.beyondeye.reduks.SimpleStore
import com.beyondeye.reduks.middlewares.ThunkMiddleware
import com.beyondeye.reduks.middlewares.applyMiddleware
import io.jackson.instacopy.middleware.ViewEffectsMiddleware
import io.jackson.instacopy.repo.FeedType
import io.jackson.instacopy.repo.NoResponse
import io.jackson.instacopy.repo.StoreInfoResponse

data class AppState(val listData: List<FeedType>,
                    val storeInfoResponse: StoreInfoResponse,
                    val loadingStoreInfo: Boolean,
                    val loadingStoreFeed: Boolean,
                    val cart: Cart) {
    companion object {
        val INITIAL_STATE = AppState(listData = mutableListOf<FeedType>(
                NoResponse(),
                NoResponse(),
                NoResponse(),
                NoResponse(),
                NoResponse()
        ),
                loadingStoreFeed = true,
                loadingStoreInfo = true,
                storeInfoResponse = StoreInfoResponse.LOADING,
                cart = Cart(mapOf()))
    }
}

/*
 * Items in cart is map of itemId to quantity in user's cart.
 */
data class Cart(val items: Map<String, Int>) {
    fun contains(itemId: String) = items.contains(itemId)

    fun numInCart(itemId: String): Int {
        return if (items.containsKey(itemId)) {
            appStore.applyMiddleware()
            items.getValue(itemId)
        } else {
            0
        }
    }

    fun totalNumItems(): Int {
        val sum = items.values.fold(0) { sum, next ->
            if (next > 0) {
                sum + 1
            } else {
                sum
            }
        }
        return sum
    }

}

val appStore = SimpleStore(AppState.INITIAL_STATE, reducer)
        .applyMiddleware(ThunkMiddleware(), ViewEffectsMiddleware)