package com.example.kotlin.Data.Local.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.kotlin.Domain.Entity.User


@Entity
data class UserLocal(
    @ColumnInfo(name = "name") var username: String,
    @ColumnInfo(name = "password") var password: String,
    @ColumnInfo(name = "mail") var mail: String
){
    @PrimaryKey(autoGenerate = true) var id: Int? = null
}

fun User.toData() : UserLocal {
    return UserLocal(
        username = username,
        password = password,
        mail = mail
    )
}

fun UserLocal.toEntity() : User {
    return User(
        username = username,
        password = password,
        mail = mail
    )
}