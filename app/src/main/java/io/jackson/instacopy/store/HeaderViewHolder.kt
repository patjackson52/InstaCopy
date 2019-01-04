package io.jackson.instacopy.store

import android.view.View
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import io.jackson.instacopy.GlideApp
import kotlinx.android.synthetic.main.item_store_header.view.*
import kotlinx.android.synthetic.main.search.view.*

class HeaderViewHolder(view: View) : BindingViewHolder<StoreHeaderViewModel>(view) {

    override fun bindViews(data: StoreHeaderViewModel) {
        with(data) {
            with(itemView) {
                txtStoreTitle.text = title
                txtSubTitle.text = subTitle
                txtWithinTime.text = withInTime
                txtMoreInfo.text = moreInfoString
                txtSearch.text = searchText
                GlideApp.with(itemView)
                        .load(imageUrl)
                        .transform(CircleCrop())
                        .into(imgStore)
                GlideApp.with(itemView)
                        .load(bckgrndImageUrl)
                        .into(imgBckgrnd)
            }
        }

    }

}