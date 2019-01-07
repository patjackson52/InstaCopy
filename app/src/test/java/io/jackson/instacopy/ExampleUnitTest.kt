package io.jackson.instacopy

import org.junit.Test

import org.junit.Assert.*
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import io.jackson.instacopy.repo.ItemsResponse
import io.jackson.instacopy.repo.MockRepository


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val moshi = Moshi.Builder().build()

    @Test
    fun serializeBrandItems() {
        val jsonAdapter = moshi.adapter<ItemsResponse>(ItemsResponse::class.java!!)

        val json = jsonAdapter.toJson(MockRepository.brandItems(""))
        println(json)
    }

    @Test
    fun deserializeBrandItems() {
        val jsonAdapter = moshi.adapter<ItemsResponse>(ItemsResponse::class.java!!)
        val brandItemsResponse = jsonAdapter.fromJson(BRAND_ITEMS_JSON)

        assertNotNull(brandItemsResponse)
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