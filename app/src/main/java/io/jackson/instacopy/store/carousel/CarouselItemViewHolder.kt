package io.jackson.instacopy.store.carousel

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StrikethroughSpan
import android.view.View
import androidx.core.content.ContextCompat
import io.jackson.instacopy.*
import io.jackson.instacopy.repo.Item
import io.jackson.instacopy.store.BindingPayloadViewHolder
import io.jackson.instacopy.store.ItemViewModel
import io.jackson.instacopy.store.ShowPickerViewEffect
import kotlinx.android.synthetic.main.item_carousel_item.view.*
import kotlinx.android.synthetic.main.quantity_picker.view.*


/**
 * Viewholder for individual item in a horizontal carousel of items
 */
class CarouselItemViewHolder(view: View) : BindingPayloadViewHolder<ItemViewModel>(view) {

    private val orgPriceColor by lazy { ContextCompat.getColor(itemView.context, R.color.carouselItemQuantity) }
    private val discountPriceColor by lazy { ContextCompat.getColor(itemView.context, R.color.red) }

    override fun bindViews(data: ItemViewModel, payloads: MutableList<Any>?) {
        if (data.item.id == Item.PLACE_HOLDER_ID) return

        if (payloads?.find { it is ShowPickerViewEffect } != null) {
            showQuantityPicker()
            return
        }

        with(itemView) {
            GlideApp.with(itemView)
                    .load(data.item.imageUrl)
                    .into(imgItem)
            if (data.item.discountPrice != null) {
                val priceSpan = SpannableString(data.item.discountPrice + " " + data.item.priceOrg)
                priceSpan.setSpan(StrikethroughSpan(), data.item.discountPrice.length + 1, priceSpan.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                priceSpan.setSpan(ForegroundColorSpan(orgPriceColor), data.item.discountPrice.length + 2, priceSpan.length - 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                priceSpan.setSpan(ForegroundColorSpan(discountPriceColor), 0, data.item.discountPrice.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                txtPrice.text = priceSpan
            } else {
                txtPrice.text = data.item.priceOrg
            }
            if (data.item.discount != null) {
                txtDiscount.visibility = View.VISIBLE
                txtDiscount.text = data.item.discount
            } else {
                txtDiscount.visibility = View.GONE
            }
            txtName.text = data.item.name
            txtQuantity.text = data.item.quantity
            btnQuantity.text = data.numInCart.toString()
            when (data.numInCart) {
                0 -> {
                    btnQuantity.visibility = View.GONE
                    layout_quantity_picker.visibility = View.GONE
                    layout_fade.visibility = View.GONE
                }
                1 -> {
                    btnQuantity.visibility = View.VISIBLE
                    btnMinus.setImageResource(R.drawable.ic__trash)
                    txtQuantityPicker.text = data.numInCart.toString()
                }
                else -> {
                    btnQuantity.visibility = View.VISIBLE
                    btnMinus.setImageResource(R.drawable.ic__minus)
                    txtQuantityPicker.text = data.numInCart.toString()
                }
            }


            btnAdd.setOnClickListener {
                appStore.dispatch(Actions.OpenQuantityPickerAction(data.item.id))
            }
            btnQuantity.setOnClickListener {
                appStore.dispatch(Actions.OpenQuantityPickerAction(data.item.id))
            }
            setQuantityPickerData(data)
        }
    }

    private fun hideQuantityPicker(data: ItemViewModel) {
        itemView.layout_quantity_picker.visibility = View.GONE
        itemView.layout_fade.visibility = View.GONE
    }

    private fun showQuantityPicker() {
        itemView.layout_fade.visibility = View.VISIBLE
        itemView.layout_quantity_picker.visibility = View.VISIBLE
        itemView.layout_quantity_picker.requestFocus()
        itemView.layout_quantity_picker.setOnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                itemView.layout_quantity_picker.visibility = View.GONE
                itemView.layout_fade.visibility = View.GONE
            }
        }
    }

    private fun setQuantityPickerData(data: ItemViewModel) {
        with(itemView) {
            itemView.txtQuantityPicker.text = data.numInCart.toString()
            btnPlus.setOnClickListener {
                appStore.dispatch(Actions.AddToCartAction(data.item.id))
            }
            btnMinus.setOnClickListener {
                appStore.dispatch(Actions.RemoveFromCartAction(data.item.id))
                when (data.numInCart - 1) {
                    0 -> {
                        itemView.layout_quantity_picker.visibility = View.GONE
                        itemView.layout_fade.visibility = View.GONE
                    }
                    1 -> {
                        btnMinus.setImageResource(R.drawable.ic__trash)
                    }
                    else -> {
                        btnMinus.setImageResource(R.drawable.ic__minus)
                    }
                }
            }

        }
    }
}

data class CarouselItemChangePayload(val isQuantityChange: Boolean)


