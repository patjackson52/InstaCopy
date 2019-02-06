package io.jackson.instacopy.middleware

import com.beyondeye.reduks.Middleware
import com.beyondeye.reduks.Store
import io.jackson.instacopy.Actions
import io.jackson.instacopy.AppState
import io.jackson.instacopy.ShowPickerViewEffect
import io.jackson.instacopy.ViewEffect

typealias ViewEffectsSubscriber = (ViewEffect) -> Unit

object ViewEffectsMiddleware : Middleware<AppState> {
    private val viewEffectsSubscribers = mutableSetOf<ViewEffectsSubscriber>()

    fun subscribeToViewEffects(subscriber: ViewEffectsSubscriber) {
        viewEffectsSubscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: ViewEffectsSubscriber) {
        viewEffectsSubscribers.remove(subscriber)
    }

    override fun dispatch(store: Store<AppState>, nextDispatcher: (Any) -> Any, action: Any): Any {
        val result = nextDispatcher(action)
        when (action) {
            is Actions.OpenQuantityPickerAction -> notifySubscribers(ShowPickerViewEffect(action.itemId))
        }
        return result
    }

    private fun notifySubscribers(data: ViewEffect) {
        viewEffectsSubscribers.forEach { it.invoke(data) }
    }
}