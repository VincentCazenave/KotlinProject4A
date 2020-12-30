package com.example.kotlin.Presentation.Main.third

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.kotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_contact_detail.*

class ContactDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)

        var intent : Intent = getIntent()

        val name = intent.getStringExtra("contactName")
        val number = intent.getStringExtra("contactNumber")
        val mail = intent.getStringExtra("contactMail")
        val birthdate = intent.getStringExtra("contactBirthdate")
        val image = intent.getStringExtra("contactImage")

        Picasso.get().load(image).into(imagedetail)

        namedetail.text = name
        numberdetail.text = number
        maildetail.text = "Mail: " + mail
        birthdatedetail.text = "Birthdate: " + birthdate

    }
}