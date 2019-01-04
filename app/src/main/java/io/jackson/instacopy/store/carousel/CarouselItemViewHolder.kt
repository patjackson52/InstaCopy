package io.jackson.instacopy.store.carousel

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StrikethroughSpan
import android.view.View
import androidx.core.content.ContextCompat
import io.jackson.instacopy.*
import io.jackson.instacopy.store.BindingViewHolder
import io.jackson.instacopy.store.Item
import kotlinx.android.synthetic.main.item_carousel_item.view.*
import kotlinx.android.synthetic.main.quantity_picker.view.*


/**
 * Viewholder for individual item in a horizontal carousel of items
 */
class CarouselItemViewHolder(view: View) : BindingViewHolder<Item>(view) {

    private val orgPriceColor by lazy { ContextCompat.getColor(itemView.context, R.color.carouselItemQuantity) }
    private val discountPriceColor by lazy { ContextCompat.getColor(itemView.context, R.color.red) }
    private var userQuantity = 1

    override fun bindViews(data: Item) {
        if (data.id == Item.PLACE_HOLDER_ID) return

        with(itemView) {
            GlideApp.with(itemView)
                    .load(data.imageUrl)
                    .into(imgItem)
            if (data.discountPrice != null) {
                val priceSpan = SpannableString(data.discountPrice + " " + data.priceOrg)
                priceSpan.setSpan(StrikethroughSpan(), data.discountPrice.length + 1, priceSpan.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                priceSpan.setSpan(ForegroundColorSpan(orgPriceColor), data.discountPrice.length + 2, priceSpan.length - 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                priceSpan.setSpan(ForegroundColorSpan(discountPriceColor), 0, data.discountPrice.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                txtPrice.text = priceSpan
            } else {
                txtPrice.text = data.priceOrg
            }
            if (data.discount != null) {
                txtDiscount.visibility = View.VISIBLE
                txtDiscount.text = data.discount
            } else {
                txtDiscount.visibility = View.GONE
            }
            txtName.text = data.name
            txtQuantity.text = data.quantity
            btnAdd.setOnClickListener {
                userQuantity++
                if (userQuantity == 1) {
                    btnMinus.setImageResource(R.drawable.ic__trash)
                } else {
                    btnMinus.setImageResource(R.drawable.ic__minus)
                }
                itemView.txtQuantityPicker.text = userQuantity.toString()
                itemView.layout_fade.visibility = View.VISIBLE
                itemView.layout_quantity_picker.visibility = View.VISIBLE
                itemView.layout_quantity_picker.requestFocus()
                btnPlus.setOnClickListener {
                    userQuantity++
                    if (userQuantity == 1) {
                        btnMinus.setImageResource(R.drawable.ic__trash)
                    } else {
                        btnMinus.setImageResource(R.drawable.ic__minus)
                    }
                    itemView.txtQuantityPicker.text = userQuantity.toString()
                }
                btnMinus.setOnClickListener {
                    userQuantity--
                    when (userQuantity) {
                        0 -> {
                            itemView.layout_quantity_picker.visibility = View.GONE
                            itemView.layout_fade.visibility = View.GONE
                        }
                        1 -> {
                            btnMinus.setImageResource(R.drawable.ic__trash)
                            itemView.txtQuantityPicker.text = userQuantity.toString()
                        }
                        else -> {
                            btnMinus.setImageResource(R.drawable.ic__minus)
                            itemView.txtQuantityPicker.text = userQuantity.toString()
                        }
                    }
                }
                itemView.layout_quantity_picker.setOnFocusChangeListener { v, hasFocus ->
                    if (!hasFocus) {
                        itemView.layout_quantity_picker.visibility = View.GONE
                        itemView.layout_fade.visibility = View.GONE
                    }
                }
            }
        }
    }
}


