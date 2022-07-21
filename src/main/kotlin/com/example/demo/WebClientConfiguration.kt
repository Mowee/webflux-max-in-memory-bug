package com.example.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {

    @Bean
    fun createsWebClient(clientBuilder: WebClient.Builder): WebClient {
        return clientBuilder.build()
    }

}
