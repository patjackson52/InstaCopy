package io.jackson.instacopy.store

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BindingViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindViews(data: T)
}