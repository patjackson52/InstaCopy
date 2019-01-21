package io.jackson.instacopy.store


sealed class ViewEffect
data class ShowPickerViewEffect(val itemId: String): ViewEffect()