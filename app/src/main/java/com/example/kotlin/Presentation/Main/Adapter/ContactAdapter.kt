package com.example.kotlin.Presentation.Main.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.Presentation.Main.third.ContactDetail
import com.example.kotlin.Domain.Entity.Contact
import com.example.kotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.raw_layout.view.*

class ContactAdapter(val context: Context, val contactList: MutableList<Contact>): RecyclerView.Adapter<ContactAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView ){

         var icon : ImageView
         var txt_name : TextView
         var txt_number : TextView

        init{
            icon = itemView.Icon
            txt_name = itemView.Name
            txt_number = itemView.Number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.raw_layout, parent, false)
        return MyViewHolder(itemView, context)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        Picasso.get().load(contactList[position].image).into(holder.icon)
        System.out.println("onBindViewHolder")
        holder.txt_name.text = contactList[position].name
        holder.txt_number.text = contactList[position].number

        holder.itemView.setOnClickListener(){
            var intent = Intent(context, ContactDetail::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("contactName", contactList[position].name)
            intent.putExtra("contactNumber", contactList[position].number)
            intent.putExtra("contactBirthdate", contactList[position].birthdate)
            intent.putExtra("contactMail", contactList[position].mail)
          //  intent.putExtra("Image", contactList[position].image)
            intent.putExtra("contactImage", contactList[position].image)
            context.startActivity(intent)
        }

    }
}