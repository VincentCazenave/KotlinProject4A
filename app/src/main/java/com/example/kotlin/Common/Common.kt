package com.example.kotlin.Common

import com.example.kotlin.Interface.RetrofitService
import com.example.kotlin.Retrofit.RetrofitClient

object Common {
    val BASE_URL: String = "https://raw.githubusercontent.com/VincentCazenave/KotlinProject4A/master/"

    val retrofitService : RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)

}