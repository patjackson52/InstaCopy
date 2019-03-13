package io.jackson.common

import com.beyondeye.reduks.SimpleStore
import com.beyondeye.reduks.middlewares.applyMiddleware
import com.beyondeye.reduks.middlewares.thunkMiddleware
import io.jackson.common.middleware.ViewEffectsMiddleware
import io.jackson.common.repo.NoResponse
import io.jackson.common.repo.StoreInfoResponse

data class AppState(val listData: List<Any>,
                    val storeInfoResponse: StoreInfoResponse,
                    val loadingStoreInfo: Boolean,
                    val loadingStoreFeed: Boolean,
                    val cart: Cart) {
    companion object {
        val INITIAL_STATE = AppState(listData = mutableListOf<Any>(
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

val appStore by lazy {
    SimpleStore(AppState.INITIAL_STATE, reducer)
            .applyMiddleware(::thunkMiddleware, ViewEffectsMiddleware::dispatch)
}