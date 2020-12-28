package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.kotlin.injection.MainViewModel
import org.koin.android.ext.android.inject
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

     val mainViewModel : MainViewModel by inject()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.str.observe(this, Observer {
            main_text.text = it
        })

    }
}