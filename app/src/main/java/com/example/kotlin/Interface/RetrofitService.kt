package com.example.kotlin.Interface

import com.example.kotlin.Model.Contact
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("ContactAPI.json")

    fun getContactList(): Call<MutableList<Contact>>
}