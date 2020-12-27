package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.Adapter.ContactAdapter
import com.example.kotlin.Common.Common
import com.example.kotlin.Interface.RetrofitService
import com.example.kotlin.Model.Contact
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var mService: RetrofitService
    lateinit var adapter: ContactAdapter
    lateinit var layoutManager: LinearLayoutManager
    lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mService = Common.retrofitService

        recyclerContactList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerContactList.layoutManager = layoutManager
        getContactList()
    }

    private fun getContactList() {
        mService.getContactList().enqueue(object : Callback<MutableList<Contact>> {
            override fun onFailure(call: Call<MutableList<Contact>>, t: Throwable) {
                System.out.println("FAILURE BOLOSSE VINCE")
            }

            override fun onResponse(call: Call<MutableList<Contact>>, response: Response<MutableList<Contact>>) {
                adapter = ContactAdapter(baseContext, response.body() as MutableList<Contact>)
                adapter.notifyDataSetChanged()
                recyclerContactList.adapter = adapter

                 System.out.println("It worked well !!")
            }

        })
    }
}