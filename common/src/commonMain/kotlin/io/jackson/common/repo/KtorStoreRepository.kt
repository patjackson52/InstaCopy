package io.jackson.common.repo

import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.http.HttpHeaders
import io.ktor.http.takeFrom
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.serialization.*
import kotlinx.serialization.internal.SerialClassDescImpl
import kotlinx.serialization.internal.StringSerializer
import kotlinx.serialization.json.Json

object KtorStoreRepository : StoreRepository {
    const val baseUrl = "https://jackson-ui-demos.firebaseio.com"

    override suspend fun storeInfo(storeId: String): GatewayResponse<StoreInfoResponse, GenericError> {
        return GlobalScope.async {

            try {
                val response: StoreInfoResponse = client.get {
                    apiUrl("storesv2/$storeId/info.json")
                }
                GatewayResponse.createSuccess<StoreInfoResponse, GenericError>(response, 200, "Success")
            } catch (e: Exception) {
                GatewayResponse.createError<StoreInfoResponse, GenericError>(GenericError("test"), 200, "Success")
            }
        }.await()
    }

    override suspend fun storeFeed(storeId: String): GatewayResponse<Map<String, FeedType>, GenericError> {
        return GlobalScope.async {
            try {
                val response: Feed = client.get {
                    apiUrl("/storesv3/$storeId/feed.json")
                }
                GatewayResponse.createSuccess<Map<String, FeedType>, GenericError>(response.items, 200, "sucess")
            } catch (e: Exception) {
                GatewayResponse.createError<Map<String, FeedType>, GenericError>(GenericError("error"), 500, "error message")
            }
        }.await()
    }

    private val client by lazy {
        return@lazy try {

            HttpClient {
                install(JsonFeature) {
                    serializer = KotlinxSerializer(Json.nonstrict).apply {
                        setMapper(StoreInfoResponse::class, StoreInfoResponse.serializer())
                        setMapper(Feed::class, Feed)
                        setMapper(FeedHolder::class, FeedHolderSerializer())
                    }
                }
                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.ALL
                }
            }


        } catch (e: Exception) {
            throw RuntimeException("Error initialization: ${e.message}")
        }
    }

    private fun HttpRequestBuilder.apiUrl(path: String) {
        header(HttpHeaders.CacheControl, "no-cache")
        url {
            takeFrom(baseUrl)
            encodedPath = path
        }
    }
}


@Serializable
class Feed(val items: Map<String, FeedType>) {

    @Serializer(Feed::class)
    companion object : KSerializer<Feed> {

        override fun serialize(output: Encoder, obj: Feed) {
            TODO("Not implemented")
        }

        override fun deserialize(input: Decoder): Feed {
            val mp = (StringSerializer to FeedHolderSerializer()).map
            val tmp = input.decodeSerializableValue(mp)

            return Feed(items = tmp.mapValues { it.value.data })
        }
    }
}

@Serializable
class FeedHolder(val type: String, val data: FeedType)

class FeedHolderSerializer: KSerializer<FeedHolder> {

    override val descriptor = object : SerialClassDescImpl("Inner") {
            init {
                addElement("atype")
                addElement("data")
            }
        }

    override fun deserialize(input: Decoder): FeedHolder {
        var fieldName: String? = null
        var serializer: KSerializer<*>
        var value: Any? = null
        input.beginStructure(descriptor).apply {
            loop@ while (true) {
                @Suppress("UNCHECKED_CAST")
                when (decodeElementIndex(descriptor)) {
                    CompositeDecoder.READ_ALL -> {
                        fieldName = decodeSerializableElement(descriptor, 0, StringSerializer)
                        serializer = when (fieldName) {
                            "coupon" -> CouponResponse.serializer()
                            "delivery" -> DeliveryOptionsResponse.serializer()
                            "carousel" -> ItemsResponse.serializer()
                            "freeDelivery" -> FreeDeliveryResponse.serializer()
                            else -> throw IllegalArgumentException("Type $fieldName not handled")
                        }
                        value = decodeSerializableElement(descriptor, 1, serializer)
                    }
                    CompositeDecoder.READ_DONE -> {
                        break@loop
                    }
                    0 -> fieldName = decodeSerializableElement(descriptor, 0, StringSerializer)
                    1 -> {
                        serializer = when (fieldName) {
                            "coupon" -> CouponResponse.serializer()
                            "delivery" -> DeliveryOptionsResponse.serializer()
                            "carousel" -> ItemsResponse.serializer()
                            "freeDelivery" -> FreeDeliveryResponse.serializer()
                            else -> throw IllegalArgumentException("Type $fieldName not handled")
                        }
                        value = decodeSerializableElement(descriptor, 1, serializer)
                    }
                }
            }
            endStructure(descriptor)
        }
        return FeedHolder(type = "test", data = value as FeedType)
    }

    override fun serialize(encoder: Encoder, obj: FeedHolder) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}