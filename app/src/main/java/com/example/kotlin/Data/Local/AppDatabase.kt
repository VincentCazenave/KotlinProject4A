    package com.example.kotlin.Data.Local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlin.Data.Local.Models.UserLocal

@Database(entities = arrayOf(
    UserLocal::class
), version = 7)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dataBaseDao(): DatabaseDao
}
