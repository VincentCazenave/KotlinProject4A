package com.example.kotlin.Presentation.Main.Status

sealed class LoginStatus()

data class LoginSuccess(val username: String, val password: String, val mail: String) : LoginStatus()
object LoginError : LoginStatus()