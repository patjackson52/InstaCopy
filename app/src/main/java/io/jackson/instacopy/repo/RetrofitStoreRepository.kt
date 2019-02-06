package io.jackson.instacopy.repo

import com.squareup.moshi.Moshi
import io.jackson.instacopy.RuntimeJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


object RetrofitStoreRepository : StoreRepository {

    override fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError> {
        val response = api.storeInfoV2(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    override fun storeFeed(storeId: String): GatewayResponse<Map<String, FeedType>, GenericError> {
        val response = api.storeFeed(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    private val okClient = OkHttpClient.Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

    private val runtimeJsonAdapter = RuntimeJsonAdapterFactory(FeedType::class.java, "type")
            .registerSubtype(ItemsResponse::class.java, "carousel")
            .registerSubtype(FreeDeliveryResponse::class.java, "freeDelivery")
            .registerSubtype(CouponResponse::class.java, "coupon")

    val moshi = Moshi.Builder().add(runtimeJsonAdapter).build()

    private val api = Retrofit.Builder()
            .baseUrl("https://jackson-ui-demos.firebaseio.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okClient)
            .build()
            .create(StoreApi::class.java)

}

interface StoreApi {

    @GET("/storesv2/{storeId}/feed.json")
    fun storeFeed(@Path("storeId") storeId: String): Call<Map<String, FeedType>>

    @GET("/storesv2/{storeId}/info.json")
    fun storeInfoV2(@Path("storeId") storeId: String): Call<StoreInfoResponse>

}