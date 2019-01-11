package io.jackson.instacopy

import android.util.Log
import com.beyondeye.reduks.*
import com.beyondeye.reduks.middlewares.ThunkMiddleware
import com.beyondeye.reduks.middlewares.applyMiddleware
import io.jackson.instacopy.boundary.toViewModel
import io.jackson.instacopy.repo.RetrofitStoreRepository
import io.jackson.instacopy.repo.StoreInfoResponse
import io.jackson.instacopy.repo.testItemCarouselPlaceholder
import io.jackson.instacopy.store.StoreHeaderViewModel
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.math.log

data class AppState(val listData: List<Any>) {
    companion object {
        val INITIAL_STATE = AppState(listData = listOf(
                StoreHeaderViewModel("Loading", "Loading", "", "", "", "", ""),
                Info
                testItemCarouselPlaceholder,
                testItemCarouselPlaceholder,
                testItemCarouselPlaceholder,
                ))
    }
}

val reducer = ReducerFn<AppState> { state, action ->
    when (action) {
        is Actions.FetchStoreInfoSuccessAction -> state.copy(storeInfo = action.storeInfoResponse.toViewModel())
        else -> throw AssertionError("Action ${action::class.java.simpleName} not handled")
    }
}

val networkMiddleware = MiddlewareFn<AppState> { store, nextDispatcher, action ->

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
}

val appStore = SimpleStore(AppState.INITIAL_STATE, reducer).applyMiddleware(ThunkMiddleware())


class Actions : Action {
    data class FetchStoreInfoAction(val storeId: String)
    data class FetchStoreInfoSuccessAction(val storeInfoResponse: StoreInfoResponse)
    data class FetchStoreInfoFailureAction(val message: String)
}
