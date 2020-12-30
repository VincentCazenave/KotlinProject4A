package com.example.kotlin.Presentation.Main.Second


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.Presentation.Main.Adapter.ContactAdapter
import com.example.kotlin.Common.Common
import com.example.kotlin.Interface.RetrofitService
import com.example.kotlin.Domain.Entity.Contact
import com.example.kotlin.R
import kotlinx.android.synthetic.main.activity_a_p_i.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class APIActivity : AppCompatActivity() {

    lateinit var mService: RetrofitService
    lateinit var adapter: ContactAdapter
    lateinit var layoutManager: LinearLayoutManager
    lateinit var contactList: MutableList<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_p_i)



        mService = Common.retrofitService
        recyclerContactList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerContactList.layoutManager = layoutManager
        getContactList()
    }

    private fun getContactList() {
        mService.getContactList().enqueue(object : Callback<MutableList<Contact>>{
            override fun onFailure(call: Call<MutableList<Contact>>, t: Throwable) {
                System.out.println("Failure, API not loaded")
            }

            override fun onResponse(call: Call<MutableList<Contact>>, response: Response<MutableList<Contact>>) {
                adapter = ContactAdapter(baseContext, response.body() as MutableList<Contact>)
                adapter.notifyDataSetChanged()
                contactList = response.body()!!
                recyclerContactList.adapter = adapter
                System.out.println("API LOADED" + contactList[1].image)
            }
        })
    }


}