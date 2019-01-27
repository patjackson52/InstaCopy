package io.jackson.instacopy.boundary

import io.jackson.instacopy.Cart
import io.jackson.instacopy.R
import io.jackson.instacopy.repo.*
import io.jackson.instacopy.store.*

fun List<FeedType>.toViewModels(cart: Cart): List<Any> {
    return this.map {
        when (it) {
            is CouponResponse -> it.toViewModel()
            is ItemsResponse -> it.toViewModel(cart)
            is FreeDeliveryResponse -> it.toViewModel()
            is NoResponse -> it.toViewModel()
        }
    }
}

fun CouponResponse.toViewModel() = InfoCardViewModel(
        bckgrndImageUrl = bckgndImageUrl,
        infoIconImageUrl = infoIconImageUrl,
        title = title,
        subTitle = subTitle,
        tintColor = R.color.infoCardYellow
)


fun FreeDeliveryResponse.toViewModel() = FreeDeliveryCardViewModel(
        bckgrndImageUrl = bckgndImageUrl,
        title = title,
        subTitle = subTitle,
        storeIcons = storeIcons
)

fun StoreInfoResponse.toViewModel() = StoreHeaderViewModel(
        title = title,
        subTitle = subTitle,
        imageUrl = imageUrl,
        bckgrndImageUrl = bckgndImageUrl,
        withInTime = withInTime,
        moreInfoString = moreInfoString,
        searchText = searchText
)

fun ItemsResponse.toViewModel(cart: Cart) = ItemCarouselViewModel(
        title = title,
        items = items.map { ItemViewModel(cart.numInCart(it.id), it) }
)

fun NoResponse.toViewModel() = testItemCarouselPlaceholder
