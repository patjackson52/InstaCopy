package io.jackson.instacopy.store

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import com.beyondeye.reduks.StoreSubscriber
import com.beyondeye.reduks.StoreSubscription
import io.jackson.instacopy.*
import io.jackson.instacopy.boundary.toViewModels
import io.jackson.instacopy.middleware.ViewEffectsMiddleware
import io.jackson.instacopy.repo.RetrofitStoreRepository
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.app_bar_main.view.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.item_carousel_item.*
import kotlinx.android.synthetic.main.search.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

class StoreFragment : Fragment(), CoroutineScope, StoreSubscriber<AppState> {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private lateinit var storeAdapter: StoreRecyclerViewAdapter
    private val loc = IntArray(2)
    private val repo = RetrofitStoreRepository
    private var subscription: StoreSubscription? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.content_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        storeAdapter = StoreRecyclerViewAdapter()
        rootRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this.context)
            adapter = storeAdapter
        }

        subscription = appStore.subscribe(this)

        appStore.dispatch(NetworkThunks.fetchStoreFeed("sprouts"))

        (rootRecyclerView.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        /*
        rootRecyclerView.addOnScrollListener(
                object : RecyclerView.OnScrollListener() {
                    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                        if (layout_search != null) {
                            layout_search.getLocationOnScreen(loc)
                            if (loc[1] < startFadeY()) {
                                activity?.searchBar?.visibility = View.VISIBLE
                                val fadePercentage = fadePercentage(loc[1])
                                activity?.searchBar?.alpha = fadePercentage
                                layout_search?.visibility = View.VISIBLE
                                if (loc[1] < endFadeY()) {
                                    layout_search?.visibility = View.GONE
                                } else {
                                    layout_search?.visibility = View.VISIBLE
                                }
                            } else {
                                activity?.searchBar?.visibility = View.GONE
                            }
                        }
                    }
                })
                */

    }


    override fun onDestroyView() {
        subscription?.unsubscribe()
        super.onDestroyView()
    }

    override fun onStateChange() {
        storeAdapter.setListData(appStore.state.listData.toViewModels(appStore.state.cart).toMutableList())
        if (appStore.state.cart.totalNumItems() > 0) {
            activity?.btnCartQuantity!!.visibility = View.VISIBLE
            activity?.btnCartQuantity!!.text = appStore.state.cart.totalNumItems().toString()
            activity?.btnTopCartQuantity!!.visibility = View.VISIBLE
            activity?.btnTopCartQuantity!!.text = appStore.state.cart.totalNumItems().toString()
        } else {
            activity?.btnCartQuantity!!.visibility = View.GONE
            activity?.btnTopCartQuantity!!.visibility = View.GONE
        }
    }


    fun startFadeY(): Int {
        val loc = IntArray(2)
        activity?.toolbar?.getLocationOnScreen(loc)
        return loc[1] + (activity?.toolbar?.height ?: 0)
    }

    fun endFadeY(): Int {
        return 32.px
    }

    fun fadePercentage(currentY: Int): Float {
        return if (startFadeY() - currentY > 0) {
            (startFadeY() - currentY) / (endFadeY()).toFloat()
        } else {
            0F
        }
    }

}
