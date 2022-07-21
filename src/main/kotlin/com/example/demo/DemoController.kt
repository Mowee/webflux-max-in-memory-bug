package com.example.demo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class DemoController {

    @PostMapping
    fun demoPostEndpointWithPayloadLargerThanDefault(@RequestBody payload: DemoPayload): String {
        return "everything is okay"
    }

}