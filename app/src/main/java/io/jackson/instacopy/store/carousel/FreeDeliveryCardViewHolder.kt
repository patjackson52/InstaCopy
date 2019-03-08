package io.jackson.instacopy.store.carousel

import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import io.jackson.common.FreeDeliveryCardViewState
import io.jackson.instacopy.GlideApp
import io.jackson.instacopy.R
import io.jackson.instacopy.store.BindingViewHolder
import kotlinx.android.synthetic.main.item_free_delivery_card.view.*

class FreeDeliveryCardViewHolder(view: View) : BindingViewHolder<FreeDeliveryCardViewState>(view) {
    private val backgndTint by lazy { ContextCompat.getColor(itemView.context, R.color.infoCardBlue) }

    override fun bindViews(data: FreeDeliveryCardViewState) {

        with(data) {
            with(itemView) {
                GlideApp.with(itemView.context)
                        .load(bckgrndImageUrl)
                        .into(object : SimpleTarget<Drawable>() {
                            override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                                itemView.post {
                                    //                                    resource.setTint(backgndTint)
                                    layout_free_delivery_root.setBackgroundColor(backgndTint)
                                    carouselFreeDeliveryRecyclerView.background = resource
                                }
                            }
                        })

                carouselFreeDeliveryRecyclerView.apply {
                    layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
                    adapter = FreeDeliveryItemAdapter().apply {
                        this.data = data
                    }
                }
            }
        }
    }
}