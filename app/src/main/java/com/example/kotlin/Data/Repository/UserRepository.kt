package com.example.kotlin.Data.Repository

import com.example.kotlin.Data.Local.DatabaseDao
import com.example.kotlin.Data.Local.Models.UserLocal
import com.example.kotlin.Data.Local.Models.toData
import com.example.kotlin.Data.Local.Models.toEntity
import com.example.kotlin.Domain.Entity.User

class UserRepository(
    private val databaseDao: DatabaseDao
) {
     fun createUser(user: User) {
        databaseDao.insert(user.toData())
    }

    fun getUser(username: String) : User? {
        val user = databaseDao.findByName(username)
        return user?.toEntity()
    }
}
