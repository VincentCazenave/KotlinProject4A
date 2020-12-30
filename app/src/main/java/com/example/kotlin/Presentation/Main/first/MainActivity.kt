package com.example.kotlin.Presentation.Main.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.kotlin.Presentation.Main.Status.CreateError
import com.example.kotlin.Presentation.Main.Status.CreateSuccess
import com.example.kotlin.Presentation.Main.Status.LoginError
import com.example.kotlin.Presentation.Main.Status.LoginSuccess
import com.example.kotlin.Presentation.Main.Second.APIActivity
import com.example.kotlin.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    val mainModel : MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainModel.loginLiveData.observe(
                this,
                Observer {
                    when(it) {
                        is LoginSuccess -> {
                            val intent = Intent(this, APIActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                            LoginError -> {
                                     MaterialAlertDialogBuilder(this)
                                        .setTitle("Erreur")
                                         .setMessage("Compte inconnu")
                                         .setPositiveButton("Ok") { dialog, which ->
                                               dialog.dismiss()
                                          }
                                            .show()
                             }
                    }
                })

        mainModel.createLiveData.observe(this, Observer {
            when(it){
                is CreateSuccess -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Bienvenue !")
                        .setPositiveButton("Merci") { dialog, which ->
                            dialog.dismiss()
                        }
                        .show()
                }

                   CreateError -> {
                       MaterialAlertDialogBuilder(this)
                           .setTitle("Erreur")
                           .setMessage("Ce compte existe déjà")
                           .setPositiveButton("Ok") { dialog, which ->
                               dialog.dismiss()
                           }
                           .show()
                   }
            }
        })

                    loginButton.setOnClickListener(){
                        mainModel.onClickedLogin(usernamelogin.text.toString().trim(), passwordlogin.text.toString().trim(), maillogin.text.toString().trim())
                    }

                    createbutton.setOnClickListener(){
                        mainModel.onClickedNew(usernamelogin.text.toString().trim(), passwordlogin.text.toString().trim(), maillogin.text.toString().trim(), applicationContext)
                    }
    }

}

/*
* package com.example.kotlin.Presentation.Main

* */