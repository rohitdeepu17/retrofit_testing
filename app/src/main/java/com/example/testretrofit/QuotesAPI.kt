package com.example.testretrofit

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuotesAPI {
    @GET("/quotes")
    suspend fun getQuotes(@Query("page")page: Int): Response<QuoteList>

    @GET("/support/v1/getUserType")
    suspend fun getUserType(@Query("email")email: String): Response<UserTypeResponse>

    //TODO : Body to JSON, Basic Auth
    @POST("/api/v1/auth/validate")
    suspend fun authValidate(@Body requestBody: RequestBody): Response<ResponseBody>
}