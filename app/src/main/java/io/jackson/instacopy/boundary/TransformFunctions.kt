package io.jackson.instacopy.boundary

import io.jackson.instacopy.Cart
import io.jackson.instacopy.R
import io.jackson.instacopy.repo.*
import io.jackson.instacopy.store.*

fun List<FeedType>.toViewState(cart: Cart, loadingStoreInfo: StoreInfoResponse): List<Any> {
    return listOf(loadingStoreInfo.toViewState()).plus(this.map {
        when (it) {
            is CouponResponse -> it.toViewState()
            is DeliveryOptionsResponse -> it.toViewState()
            is ItemsResponse -> it.toViewState(cart)
            is FreeDeliveryResponse -> it.toViewState()
            is NoResponse -> it.toViewState()
        }
    })
}

fun CouponResponse.toViewState() = InfoCardViewState(
        bckgrndImageUrl = bckgndImageUrl,
        infoIconImageUrl = infoIconImageUrl,
        title = title,
        subTitle = subTitle,
        tintColor = R.color.infoCardYellow
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
