package io.jackson.instacopy

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import io.jackson.common.repo.ItemsResponse
import io.jackson.common.repo.KtorStoreRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.junit.Assert.assertNotNull
import org.junit.Ignore
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val moshi = Moshi.Builder().build()
    private val repo = KtorStoreRepository()

    @Test
    fun deserializeBrandItems() {
        val jsonAdapter = moshi.adapter<ItemsResponse>(ItemsResponse::class.java!!)
        val brandItemsResponse = jsonAdapter.fromJson(BRAND_ITEMS_JSON)

        assertNotNull(brandItemsResponse)
    }

    @Test
    fun retrofitRepoFetchesJson() {
        GlobalScope.launch {
            withContext(Dispatchers.Default) {
                val response = repo.storeInfo("sprouts", this)
                assertNotNull(response)
            }
        }
    }

    @Ignore("needs updating to Kotlin serialization")
    @Test
    fun deserializePolymorphicJson() {
        val type = Types.newParameterizedType(Map::class.java, String::class.java, Any::class.java)

//        val jsonAdaper = KtorStoreRepository.moshi.adapter<Map<String, Any>>(type)
//        val result = jsonAdaper.fromJson(polymorphicJson)
//
//        assertNotNull(result)
    }
}


const val BRAND_ITEMS_JSON = """{
"title":"Sprouts Brand",
"items":[
{
"id":"6725a436-e529-4353-8898-b494d6ae6983",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
"name":"Sprouts Large Brown Cage Free Grade A Eggs",
"priceOrg":"${'$'}2.99",
"quantity":"12 ct"
},
{
"id":"9d61c9c5-7213-427d-a938-06bbd2bd9f6e",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
"name":"Sprouts Large Cage Free Grade A Brown Eggs",
"priceOrg":"${'$'}4.19",
"quantity":"12 ct"
},
{
"id":"88041031-474c-4294-8640-2388cdbe1af6",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_a362b7eb-16f5-4a33-8bdc-d14da1a8e1d1.png?alt=media",
"name":"Sprouts Spinach",
"priceOrg":"${'$'}1.99 each",
"quantity":"9 oz"
},
{
"discount":"${'$'}0.49 off",
"discountPrice":"${'$'}3.50",
"id":"215cd4b0-7555-4918-8f8e-cf098458fa75",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
"name":"Sprouts Drinking Water",
"priceOrg":"${'$'}3.99",
"quantity":"24 ct"
},
{
"id":"2c7898fa-d7cb-4b4d-879d-b5f82a1c39c2",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_9877cba0-4f49-4d01-869b-166361ec517f.png?alt=media",
"name":"Sprouts Organic Large Grade A Brown Eggs",
"priceOrg":"${'$'}3.99",
"quantity":"12 oz"
},
{
"id":"c9772a03-99a8-4d9b-9e13-61b4990e528d",
"imageUrl":"https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
"name":"Sprouts Whole Milk",
"priceOrg":"${'$'}3.49",
"quantity":"128 fl oz"
}
]
}"""

const val polymorphicJson = """{
  "1": {
    "bckgndImageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/card-background@2x.png?alt=media",
    "infoIconImageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/coupons-icon@2x.png?alt=media",
    "subTitle": "Up to 40% off everyday essentials",
    "title": "Coupon savings",
    "type": "coupon"
  },
  "2": {
    "items": [
      {
        "id": "e4a52bac-7417-46fc-a8e1-f8046e71c194",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
        "name": "Sprouts Large Brown Cage Free Grade A Eggs",
        "priceOrg": "${'$'}2.99",
        "quantity": "12 ct"
      },
      {
        "id": "a4da67e6-016a-445a-bd77-c6e83df177a4",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
        "name": "Sprouts Large Cage Free Grade A Brown Eggs",
        "priceOrg": "${'$'}4.19",
        "quantity": "12 ct"
      },
      {
        "id": "a1a6a61a-3e92-46fd-b163-b9bf446272af",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_a362b7eb-16f5-4a33-8bdc-d14da1a8e1d1.png?alt=media",
        "name": "Sprouts Spinach",
        "priceOrg": "${'$'}1.99 each",
        "quantity": "9 oz"
      },
      {
        "discount": "${'$'}0.49 off",
        "discountPrice": "${'$'}3.50",
        "id": "903eb3ac-1875-4b7c-a642-c65b2f920052",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
        "name": "Sprouts Drinking Water",
        "priceOrg": "${'$'}3.99",
        "quantity": "24 ct"
      },
      {
        "id": "de9d4308-9c4e-42ff-a602-5d72fc49b81c",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_9877cba0-4f49-4d01-869b-166361ec517f.png?alt=media",
        "name": "Sprouts Organic Large Grade A Brown Eggs",
        "priceOrg": "${'$'}3.99",
        "quantity": "12 oz"
      },
      {
        "id": "07fce465-efa9-4090-b2b6-6b88bab649d7",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
        "name": "Sprouts Whole Milk",
        "priceOrg": "${'$'}3.49",
        "quantity": "128 fl oz"
      }
    ],
    "numItems": 52,
    "title": "Sprouts Brand",
    "type": "carousel"
  },
  "3": {
    "items": [
      {
        "id": "e4a52bac-7417-46fc-a8e1-f8046e71c194",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
        "name": "Sprouts Large Brown Cage Free Grade A Eggs",
        "priceOrg": "${'$'}2.99",
        "quantity": "12 ct"
      },
      {
        "id": "a4da67e6-016a-445a-bd77-c6e83df177a4",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_29b20190-7b24-4b7c-b5e8-2b556d51552b.png?alt=media",
        "name": "Sprouts Large Cage Free Grade A Brown Eggs",
        "priceOrg": "${'$'}4.19",
        "quantity": "12 ct"
      },
      {
        "id": "a1a6a61a-3e92-46fd-b163-b9bf446272af",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_a362b7eb-16f5-4a33-8bdc-d14da1a8e1d1.png?alt=media",
        "name": "Sprouts Spinach",
        "priceOrg": "${'$'}1.99 each",
        "quantity": "9 oz"
      },
      {
        "discount": "${'$'}0.49 off",
        "discountPrice": "${'$'}3.50",
        "id": "903eb3ac-1875-4b7c-a642-c65b2f920052",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
        "name": "Sprouts Drinking Water",
        "priceOrg": "${'$'}3.99",
        "quantity": "24 ct"
      },
      {
        "id": "de9d4308-9c4e-42ff-a602-5d72fc49b81c",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/sprout%2Flarge_9877cba0-4f49-4d01-869b-166361ec517f.png?alt=media",
        "name": "Sprouts Organic Large Grade A Brown Eggs",
        "priceOrg": "${'$'}3.99",
        "quantity": "12 oz"
      },
      {
        "id": "07fce465-efa9-4090-b2b6-6b88bab649d7",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
        "name": "Sprouts Whole Milk",
        "priceOrg": "${'$'}3.49",
        "quantity": "128 fl oz"
      }
    ],
    "numItems": 122,
    "title": "Based on your cart",
    "type": "carousel"
  },
  "4": {
    "bckgndImageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/card-background@2x.png?alt=media",
    "storeIcons": [
      {
        "iconUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Flogo_sprout.png?alt=media",
        "name": "Sprouts"
      },
      {
        "iconUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fbevmo.png?alt=media",
        "name": "Bevmo"
      },
      {
        "iconUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fbi_rite.png?alt=media",
        "name": "Bi-rite"
      }
    ],
    "subTitle": "with select items",
    "title": "Free Delivery",
    "type": "freeDelivery"
  },
  "5": {
    "items": [
      {
        "discount": "1.93 off",
        "discountPrice": "${'$'}3.56",
        "id": "f7feb9bd-8850-4017-a065-d5ef6dd314d6",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeefless_tips.png?alt=media",
        "name": "Garden Home Style Beefless Tips",
        "priceOrg": "${'$'}5.49",
        "quantity": "255 g"
      },
      {
        "id": "817cef11-ec0b-4a73-ae78-13ad30c2dae2",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast.png?alt=media",
        "name": "Field Roast Vegan Apple Maple Breakfast Sausage",
        "priceOrg": "${'$'}5.29",
        "quantity": "9.31 oz"
      },
      {
        "discount": "${'$'}1.93 off",
        "discountPrice": "${'$'}3.56",
        "id": "2f8ef6a7-6503-417b-8b5f-74a292c5a4a6",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fchx_tenders.JPG?alt=media",
        "name": "Garden Seven Grain Crispy Tenders",
        "priceOrg": "${'$'}5.49",
        "quantity": "9 oz"
      },
      {
        "id": "9c116e64-8acd-4bc2-9290-23a92bb3a307",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Ffield_roast2.png?alt=media",
        "name": "Field Roast Smoked Apple Sage Sausages",
        "priceOrg": "${'$'}5.79",
        "quantity": "12.95 oz"
      },
      {
        "discountPrice": "${'$'}3.79",
        "id": "b1813b50-d4e2-4cc1-8a6a-1331093c29ee",
        "imageUrl": "https://firebasestorage.googleapis.com/v0/b/jackson-ui-demos.appspot.com/o/stores%2Fsprout%2Fsuggestions%2Fbeyond_meat.jpg?alt=media",
        "name": "Lightlife Veggie Smart Dogs Protein Links",
        "priceOrg": "${'$'}4.49",
        "quantity": "12 oz"
      }
    ],
    "numItems": 12,
    "title": "Based on your cart",
    "type": "carousel"
  }
}
"""