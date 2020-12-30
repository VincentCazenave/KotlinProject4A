package com.example.kotlin.Data.Local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlin.Data.Local.Models.UserLocal


@Dao
interface DatabaseDao {
    @Query("SELECT * FROM userLocal")
    fun getAll(): List<UserLocal>

    @Query("SELECT * FROM userLocal WHERE name LIKE :username")
    fun findByName(username: String): UserLocal?

    @Insert
    fun insert(user: UserLocal)

    @Delete
    fun delete(user: UserLocal)

}