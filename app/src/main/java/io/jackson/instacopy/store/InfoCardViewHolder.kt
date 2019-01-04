package io.jackson.instacopy.store

import android.view.View
import androidx.core.content.ContextCompat
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import io.jackson.instacopy.GlideApp
import io.jackson.instacopy.R
import io.jackson.instacopy.RoundedCornersTransformation
import kotlinx.android.synthetic.main.item_info_card.view.*

class InfoCardViewHolder(view: View) : BindingViewHolder<InfoCardViewModel>(view) {
    private val roundedCornersDrawable by lazy { ContextCompat.getDrawable(itemView.context, R.drawable.rounded_outline_8dp) }

    override fun bindViews(data: InfoCardViewModel) {
        roundedCornersDrawable!!.setTint(ContextCompat.getColor(itemView.context, data.tintColor))

        with(data) {
            with(itemView) {
                txtTitle.text = title
                txtSubtitle.text = subTitle
                GlideApp.with(imgCardBckgrnd)
                        .load(bckgrndImageUrl)
                        .transform(RoundedCornersTransformation(itemView.context, 8, 8))
                        .into(imgCardBckgrnd)
                imgCardBckgrnd.background = roundedCornersDrawable
                imgCardBckgrnd.clipToOutline = true
                GlideApp.with(itemView)
                        .load(infoIconImageUrl)
                        .transform(CircleCrop())
                        .into(imgInfoIcon)
            }
        }

    }

}