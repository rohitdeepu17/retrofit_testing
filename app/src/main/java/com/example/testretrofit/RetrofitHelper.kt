package com.example.testretrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //val BASE_URL = "https://quotable.io/"
    //val BASE_URL = "http://34.171.21.214:52195/"
    private const val BASE_URL = "http://34.31.250.153:58001/"
    //private const val BASE_URL = "http://35.194.28.62:58001/"

    val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    //logging.setLevel(HttpLoggingInterceptor.Level.BODY)

    val client = OkHttpClient.Builder()
        .addInterceptor(BasicAuthInterceptor("test", "fitpeo"))
        .addInterceptor(logging)
        .build()

    fun getInstance(): Retrofit
    {
        return Retrofit.Builder()
            .client(client)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}