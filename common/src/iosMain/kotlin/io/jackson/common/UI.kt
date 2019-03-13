package io.jackson.common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import kotlin.coroutines.CoroutineContext

class UI : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        Logger.d("dispatching block")
        val queue = dispatch_get_main_queue()
        dispatch_async(queue) {
            Logger.d("inside dispatched block")
            block.run()
        }
    }
}