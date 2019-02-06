package io.jackson.instacopy

import com.beyondeye.reduks.*
import io.jackson.instacopy.repo.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 * Thunks are functions that are executed by the "ThunkMiddleware".  They are asynchronous and dispatch
 * actions.  This allows dispatching a loading, success, and failure state.
 */
object NetworkThunks : CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    fun fetchStoreInfoAndFeed(storeId: String) = ThunkFn<AppState> { dispatcher, state ->
        launch {
            withContext(Dispatchers.IO) {
                appStore.dispatch(Actions.FetchStoreFeedLoadingAction())
                val deferredInfo = async {
                    //simulate poor network conditions so we see loading state
                    Thread.sleep(2000)
                    val result = RetrofitStoreRepository.storeInfo(storeId)
                    if (result.isSuccessful) {
                        appStore.dispatch(Actions.FetchStoreInfoSuccessAction(result.response!!))
                    } else {
                        appStore.dispatch(Actions.FetchStoreInfoFailureAction(result.message!!))
                    }
                }
                val deferredFeed = async {
                    //simulate poor network conditions so we see loading state
                    Thread.sleep(5000)
                    val result = RetrofitStoreRepository.storeFeed(storeId)
                    if (result.isSuccessful) {
                        appStore.dispatch(Actions.FetchStoreFeedSuccessAction(result.response!!))
                    } else {
                        appStore.dispatch(Actions.FetchStoreFeedFailureAction(result.message!!))
                    }

                }
                deferredInfo.await()
                deferredFeed.await()
            }
        }
    }
}
