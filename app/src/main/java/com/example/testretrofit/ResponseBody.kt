package com.example.testretrofit

data class ResponseBody(
    val details: Details,
    val message: String,
    val status: Int,
    val statusCode: String,
    val timestamp: String
)