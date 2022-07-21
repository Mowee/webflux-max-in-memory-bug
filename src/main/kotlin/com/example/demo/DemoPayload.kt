package com.example.demo

data class DemoPayload(
    val data: List<DemoPayloadData>
)

data class DemoPayloadData(
    val id: String,
    val timestamp: String,
    val someValue: String,
    val someNumber: Long
)
