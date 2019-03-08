package io.jackson.common


sealed class ViewEffect

data class ShowPickerViewEffect(val itemId: String): ViewEffect()