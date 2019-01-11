package io.jackson.instacopy.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.beyondeye.reduks.StoreSubscriber
import io.jackson.instacopy.*
import io.jackson.instacopy.repo.RetrofitStoreRepository
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
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

        appStore.dispatch(NetworkThunks.fetchStoreInfoThunk("sprouts"))

        val subscription = appStore.subscribe(StoreSubscriber {

        })

//
//        launch {
//            var storeInfo: StoreHeaderViewModel
//            async {
//                storeInfo = repo.storeInfo("sprouts").toViewModel()
//                storeAdapter.setListData(mutableListOf(repo.storeInfo("").toViewModel(),
//                        repo.coupons("").toViewModel(),
//                        testItemCarouselPlaceholder,
//                        repo.freeDeliveries("").toViewModel(),
//                        testItemCarouselPlaceholder,
//                        testItemCarouselPlaceholder))
//            }
//        }
//
//        async {
//            Thread.sleep(2000)
//            storeAdapter.setListData(mutableListOf(MockRepository.storeInfo("").toViewModel(),
//                    repo.coupons("").toViewModel(),
//                    repo.suggestions("").toViewModel(),
//                    repo.freeDeliveries("").toViewModel(),
//                    testItemCarouselPlaceholder,
//                    testItemCarouselPlaceholder))
//        }
//
//        async {
//            Thread.sleep(5000)
//            storeAdapter.setListData(mutableListOf(MockRepository.storeInfo("").toViewModel(),
//                    repo.coupons("").toViewModel(),
//                    repo.suggestions("").toViewModel(),
//                    repo.freeDeliveries("").toViewModel(),
//                    repo.brandItems("").toViewModel(),
//                    testItemCarouselPlaceholder))
//        }

        rootRecyclerView.addOnScrollListener(
                object : RecyclerView.OnScrollListener() {
                    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
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
                })

    }

    override fun onStateChange() {
        appStore.state.
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
