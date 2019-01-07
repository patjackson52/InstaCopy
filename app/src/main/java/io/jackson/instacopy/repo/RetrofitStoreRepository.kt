package io.jackson.instacopy.repo

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


object RetrofitStoreRepository : StoreRepository {

    override fun storeInfo(storeId: String): StoreInfoResponse {
        return api.storeInfo(storeId).execute().body()!!
    }

    override fun suggestions(storeId: String): ItemsResponse {
        return api.suggestions(storeId).execute().body()!!
    }

    override fun freeDeliveries(storeId: String): FreeDeliveryResponse {
        return api.freeDelivery(storeId).execute().body()!!
    }

    override fun brandItems(storeId: String): ItemsResponse {
        return api.brandItems(storeId).execute().body()!!
    }

    override fun coupons(storeId: String): CouponResponse {
        return api.coupons(storeId).execute().body()!!
    }

    private val okClient = OkHttpClient.Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    private val api = Retrofit.Builder()
            .baseUrl("https://jackson-ui-demos.firebaseio.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okClient)
            .build()
            .create(StoreApi::class.java)

}

interface StoreApi {
    @GET("/stores/{storeId}.json")
    fun storeInfo(@Path("storeId") storeId: String): Call<StoreInfoResponse>

    @GET("/stores/{storeId}/suggestions.json")
    fun suggestions(@Path("storeId") storeId: String): Call<ItemsResponse>

    @GET("/stores/{storeId}/brand.json")
    fun brandItems(@Path("storeId") storeId: String): Call<ItemsResponse>

    @GET("/stores/{storeId}/freeDelivery.json")
    fun freeDelivery(@Path("storeId") storeId: String): Call<FreeDeliveryResponse>

    @GET("/stores/{storeId}/coupons.json")
    fun coupons(@Path("storeId") storeId: String): Call<CouponResponse>
}