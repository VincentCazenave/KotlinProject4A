package com.example.kotlin.Presentation.Main.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.kotlin.R
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)


    }
}