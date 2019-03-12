package io.jackson.common.boundary

import io.jackson.common.*
import io.jackson.common.repo.*

fun List<FeedType>.toViewState(cart: Cart, loadingStoreInfo: StoreInfoResponse, tintColorRes: Int): List<Any> {
    return listOf(loadingStoreInfo.toViewState()).plus(this.map {
        when (it) {
            is CouponResponse -> it.toViewState(tintColorRes)
            is DeliveryOptionsResponse -> it.toViewState()
            is ItemsResponse -> it.toViewState(cart)
            is FreeDeliveryResponse -> it.toViewState()
            is NoResponse -> it.toViewState()
        }
    })
}

fun CouponResponse.toViewState(colorRes: Int) = InfoCardViewState(
        bckgrndImageUrl = bckgndImageUrl,
        infoIconImageUrl = infoIconImageUrl,
        title = title,
        subTitle = subTitle,
        tintColor = colorRes
)

fun DeliveryOptionsResponse.toViewState() = DeliveryOptionViewState(address, time)

fun FreeDeliveryResponse.toViewState() = FreeDeliveryCardViewState(
        bckgrndImageUrl = bckgndImageUrl,
        title = title,
        subTitle = subTitle,
        storeIcons = storeIcons
)

fun StoreInfoResponse.toViewState() = StoreHeaderViewState(
        title = title,
        subTitle = subTitle,
        imageUrl = imageUrl,
        bckgrndImageUrl = bckgndImageUrl,
        withInTime = withInTime,
        moreInfoString = moreInfoString,
        searchText = searchText
)

fun ItemsResponse.toViewState(cart: Cart) = ItemCarouselViewState(
        title = title,
        items = items.map { ItemViewState(cart.numInCart(it.id), it) }
)

fun NoResponse.toViewState() = testItemCarouselPlaceholder

//TODO move this somewhere
val testItemCarouselPlaceholder = ItemCarouselViewState(
        title = "Based on your cart",
        items = listOf(ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER,
                ItemViewState.PLACE_HOLDER)
)