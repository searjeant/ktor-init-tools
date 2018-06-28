package io.ktor.start.features.client

import io.ktor.start.*
import io.ktor.start.project.*
import io.ktor.start.util.*

object AuthBasicClientFeature : ClientFeature(CoreClientEngine) {
    override val id = "ktor-client-auth-basic"
    override val title = "Auth Basic feature HttpClient"
    override val description = "Supports basic authentication for the Http Client"
    override val documentation = "https://ktor.io/clients/http-client.html#basicauth"
}

object JsonClientFeature : ClientFeature(CoreClientEngine) {
    override val id = "ktor-client-json"
    override val title = "Json serialization for HttpClient"
    override val description = "Supports basic authentication for the Http Client"
    override val documentation = "https://ktor.io/clients/http-client.html#jsonfeature"

    override fun BlockBuilder.renderFeature(info: BuildInfo) {
        addImport("io.ktor.client.features.json.*")
        append(CoreClientEngine.CLIENT_FEATURES) {
            "install(JsonFeature)" {
                +"serializer = GsonSerializer()"
            }
        }
    }
}

object WebSocketClientFeature : ClientFeature(CoreClientEngine) {
    override val id = "ktor-client-websocket"
    override val title = "WebSockets HttpClient support"
    override val description = "HttpClient feature to establish bidirectional communication using WebSockets"
    override val documentation = "https://ktor.io/clients/http-client.html#websockets"
}
