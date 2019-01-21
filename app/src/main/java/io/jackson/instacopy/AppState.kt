package io.jackson.instacopy

import com.beyondeye.reduks.SimpleStore
import com.beyondeye.reduks.middlewares.ThunkMiddleware
import com.beyondeye.reduks.middlewares.applyMiddleware
import io.jackson.instacopy.middleware.ViewEffectsMiddleware
import io.jackson.instacopy.repo.ApiResponse
import io.jackson.instacopy.repo.NoResponse

data class AppState(val listData: MutableList<ApiResponse>,
                    val cart: Cart) {
    companion object {
        val INITIAL_STATE = AppState(listData = mutableListOf<ApiResponse>(
                NoResponse(),
                NoResponse(),
                NoResponse(),
                NoResponse(),
                NoResponse()
        ),
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
            items[itemId]!!
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