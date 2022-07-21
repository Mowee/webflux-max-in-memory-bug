package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@WebFluxTest(DemoController::class)
class DemoControllerTest {

    @Autowired
    private lateinit var webClient: WebTestClient

    @Test
    fun `test that endpoint does not fail if the payload is above 256 kb`() {
        // given
        val bigPayload = readTestFile("request.json")

        // when
        webClient.post()
            .uri("/")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(bigPayload)
            .exchange()
            .expectStatus()
            .isOk
    }

    fun readTestFile(source: String) = DemoControllerTest()::javaClass.get().classLoader
        .getResource(source)!!.readText()
}