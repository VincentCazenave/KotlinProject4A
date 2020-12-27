package com.example.kotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.Model.Contact
import com.example.kotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.raw_layout.view.*

class ContactAdapter(val context: Context, val contactList: MutableList<Contact>): RecyclerView.Adapter<ContactAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView ){
        var icon : ImageView
        var txt_name : TextView
        var txt_number : TextView

        init {
            icon = itemView.icon
            txt_name = itemView.Name
            txt_number = itemView.Number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.raw_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Picasso.get().load(contactList[position].image).into(holder.icon)
        holder.txt_name.text = contactList[position].name
        holder.txt_number.text = contactList[position].number
    }
}