package com.example.kotlin.Presentation.Main.Status


sealed class CreateUserStatus()

object CreateSuccess : CreateUserStatus()
object CreateError : CreateUserStatus()