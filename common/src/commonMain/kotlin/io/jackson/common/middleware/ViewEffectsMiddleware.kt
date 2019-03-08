package io.jackson.common.middleware

import com.beyondeye.reduks.Store
import io.jackson.common.Actions
import io.jackson.common.AppState
import io.jackson.common.ShowPickerViewEffect
import io.jackson.common.ViewEffect

typealias ViewEffectsSubscriber = (ViewEffect) -> Unit

/**
 * Middleware that handles visual "side effects".  These are temporary effects on the UI that
 * are not persisted in the app state, i.e. animations and transitions
 * Listens to actions and dispatches "ViewEffects" to subscribers.
 * Subscribe with:
 *      ViewEffectsMiddleware.subscribeToViewEffects(this)
 *
 *  Must be unsubscribed to avoid leaks.
 */
object ViewEffectsMiddleware {
    private val viewEffectsSubscribers = mutableSetOf<ViewEffectsSubscriber>()

    fun subscribeToViewEffects(subscriber: ViewEffectsSubscriber) {
        viewEffectsSubscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: ViewEffectsSubscriber) {
        viewEffectsSubscribers.remove(subscriber)
    }

    fun dispatch(store: Store<AppState>, nextDispatcher: (Any) -> Any, action: Any): Any {
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