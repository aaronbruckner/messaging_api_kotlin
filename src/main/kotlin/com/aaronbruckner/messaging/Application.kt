package com.aaronbruckner.messaging

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

const val PORT = 8080

fun main() {
    embeddedServer(Netty, port = PORT) {
        routing {
            get("/healthcheck") {
                call.respondText("OK", status = HttpStatusCode.OK)
            }
        }
    }.start(wait = true)
}