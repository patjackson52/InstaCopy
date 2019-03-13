package io.jackson.common

import com.beyondeye.reduks.*
import io.jackson.common.repo.KtorStoreRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 * Thunks are functions that are executed by the "ThunkMiddleware".  They are asynchronous and dispatch
 * actions.  This allows dispatching a loading, success, and failure state.
 */
class NetworkThunks(val uiContext: CoroutineContext) : CoroutineScope {
    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = uiContext + job

    val repo = KtorStoreRepository()

    fun fetchStoreInfoAndFeed(storeId: String): ThunkImpl<AppState> = ThunkFn<AppState> { dispatcher, state ->
        Logger.d("Fetching StoreInfo and Feed")
        launch {
            Logger.d("Inside Launch")
                //TODO consider other dispatcher - maybe pass in
                Logger.d("Dispatching Loading Action")
                appStore.dispatch(Actions.FetchStoreFeedLoadingAction())
                val deferredInfo = async {
                    //simulate poor network conditions so we see loading state
                    //                    Thread.sleep(2000)
                    Logger.d("Making api call")
                    val result = repo.storeInfo(storeId, this)
                    if (result.isSuccessful) {
                        Logger.d("Success!!")
                        appStore.dispatch(Actions.FetchStoreInfoSuccessAction(result.response!!))
                    } else {
                        Logger.d("Failure!! ${result.message}")
                        appStore.dispatch(Actions.FetchStoreInfoFailureAction(result.message!!))
                    }
                }
                val deferredFeed = async {
                    //simulate poor network conditions so we see loading state
                    //                    Thread.sleep(5000)
                    Logger.d("Making StoreFeed api call")
                    val result2 = repo.storeFeed(storeId, this)
                    if (result2.isSuccessful) {
                        Logger.d("Success!!")
                        appStore.dispatch(Actions.FetchStoreFeedSuccessAction(result2.response!!))
                    } else {
                        Logger.d("Failure!! ${result2.message}")
                        appStore.dispatch(Actions.FetchStoreFeedFailureAction(result2.message!!))
                    }

                }
                deferredInfo.await()
                deferredFeed.await()
                Logger.d("DONE")
            }
    }
}
