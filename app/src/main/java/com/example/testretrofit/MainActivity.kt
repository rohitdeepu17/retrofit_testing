package com.example.testretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quotesAPI = RetrofitHelper.getInstance().create((QuotesAPI::class.java))

        GlobalScope.launch {
            //val result = quotesAPI.getQuotes(1)
            //val result = quotesAPI.getUserType("hemanthcaretaker@yopmail.com")
            val result = quotesAPI.authorize(RequestBody("mobileNumber","9182004928" ))
            print(result.body())
            Log.d("Rohit", "body : ${result.body()}")
        }
    }
}