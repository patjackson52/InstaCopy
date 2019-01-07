package io.jackson.instacopy.boundary

import io.jackson.instacopy.R
import io.jackson.instacopy.repo.CouponResponse
import io.jackson.instacopy.repo.FreeDeliveryResponse
import io.jackson.instacopy.repo.ItemsResponse
import io.jackson.instacopy.repo.StoreInfoResponse
import io.jackson.instacopy.store.FreeDeliveryCardViewModel
import io.jackson.instacopy.store.InfoCardViewModel
import io.jackson.instacopy.store.ItemCarouselViewModel
import io.jackson.instacopy.store.StoreHeaderViewModel

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

fun ItemsResponse.toViewModel() = ItemCarouselViewModel(
        title = title,
        items = items
)
