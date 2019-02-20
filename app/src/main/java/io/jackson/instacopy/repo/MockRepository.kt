package io.jackson.instacopy.repo

import io.jackson.instacopy.store.*

/*
object MockRepository : StoreRepository {

    override fun storeInfo(storeId: String) = StoreInfoResponse(
            title = "Sprouts Farmers Market",
            subTitle = "Stores in 94016",
            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Flogo_sprout.png?alt=media",
            bckgndImageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/grocery_bckgnd.jpg?alt=media",
            withInTime = "Within 2 hours",
            moreInfoString = "Everyday store prices • More info",
            searchText = "Search Sprouts Farmers Market"
    )

    override fun suggestions(storeId: String) = ItemsResponse(
            title = "Based on your cart",
            items = listOf(
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeefless_tips.png?alt=media",
                            discountPrice = "$3.56",
                            priceOrg = "$5.49",
                            discount = "1.93 off",
                            name = "Garden Home Style Beefless Tips",
                            quantity = "255 g"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast.png?alt=media",
                            priceOrg = "$5.29",
                            name = "Field Roast Vegan Apple Maple Breakfast Sausage",
                            quantity = "9.31 oz"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fchx_tenders.JPG?alt=media",
                            discountPrice = "$3.56",
                            priceOrg = "$5.49",
                            discount = "$1.93 off",
                            name = "Garden Seven Grain Crispy Tenders",
                            quantity = "9 oz"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
                            priceOrg = "$5.79",
                            name = "Field Roast Smoked Apple Sage Sausages",
                            quantity = "12.95 oz"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
                            discountPrice = "$3.79",
                            priceOrg = "$4.49",
                            name = "Lightlife Veggie Smart Dogs Protein Links",
                            quantity = "12 oz"
                    )
            )
    )

    override fun freeDeliveries(storeId: String) = FreeDeliveryResponse(
            title = "Free Delivery",
            subTitle = "with select items",
            bckgndImageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/card-background@2x.png?alt=media",
            storeIcons = listOf(
                    StoreIcon(
                            iconUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Flogo_sprout.png?alt=media",
                            name = "Sprouts"),
                    StoreIcon(
                            iconUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fbevmo.png?alt=media",
                            name = "Bevmo"),
                    StoreIcon(
                            iconUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fbi_rite.png?alt=media",
                            name = "Bi-rite")
            )
    )

    override fun brandItems(storeId: String) = ItemsResponse(
            title = "Sprouts Brand",
            items = listOf(
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
                            priceOrg = "$2.99",
                            name = "Sprouts Large Brown Cage Free Grade A Eggs",
                            quantity = "12 ct"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
                            priceOrg = "$4.19",
                            name = "Sprouts Large Cage Free Grade A Brown Eggs",
                            quantity = "12 ct"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_a362b7eb-16f5-4a33-8bdc-d14da1a8e1d1.png?alt=media",
                            priceOrg = "$1.99 each",
                            name = "Sprouts Spinach",
                            quantity = "9 oz"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
                            discountPrice = "$3.50",
                            discount = "$0.49 off",
                            priceOrg = "$3.99",
                            name = "Sprouts Drinking Water",
                            quantity = "24 ct"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_9877cba0-4f49-4d01-869b-166361ec517f.png?alt=media",
                            priceOrg = "$3.99",
                            name = "Sprouts Organic Large Grade A Brown Eggs",
                            quantity = "12 oz"
                    ),
                    Item(
                            imageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
                            priceOrg = "$3.49",
                            name = "Sprouts Whole Milk",
                            quantity = "128 fl oz"
                    )
            ))

    override fun coupons(storeId: String) = CouponResponse(
            title = "Coupon savings",
            subTitle = "Up to 40% off everyday essentials",
            bckgndImageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/card-background@2x.png?alt=media",
            infoIconImageUrl = "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/coupons-icon@2x.png?alt=media"
    )
}
*/


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
