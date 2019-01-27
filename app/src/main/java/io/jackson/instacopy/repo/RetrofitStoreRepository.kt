package io.jackson.instacopy.repo

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


object RetrofitStoreRepository : StoreRepository {

    override fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError> {
        val response = api.storeInfo(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    override fun suggestions(storeId: String): GatewayResponse<ItemsResponse, GenericError> {
        val response = api.suggestions(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    override fun freeDeliveries(storeId: String): GatewayResponse<FreeDeliveryResponse, GenericError> {
        val response = api.freeDelivery(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    override fun brandItems(storeId: String): GatewayResponse<ItemsResponse, GenericError> {
        val response = api.brandItems(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }
    }

    override fun coupons(storeId: String): GatewayResponse<CouponResponse, GenericError> {
        val response = api.coupons(storeId).execute()
        return if (response.isSuccessful) {
            GatewayResponse.createSuccess(response.body(), response.code(), response.message())
        } else {
            GatewayResponse.createError(GenericError(response.message()), response.code(), response.message())
        }

    }

    override fun storeFeed(storeId: String): GatewayResponse<StoreFeedResponse, GenericError> {
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

    @GET("/storesV2/{storeId}")
    fun storeFeed(@Path("storeId") storeId: String): Call<StoreFeedResponse>
}