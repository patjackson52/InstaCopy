package io.jackson.instacopy


sealed class ViewEffect

data class ShowPickerViewEffect(val itemId: String): ViewEffect()