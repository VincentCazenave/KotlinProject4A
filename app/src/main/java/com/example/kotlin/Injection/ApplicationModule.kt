package com.example.kotlin.Injection

import android.content.Context
import androidx.room.Room
import com.example.kotlin.Data.Local.AppDatabase
import com.example.kotlin.Data.Local.DatabaseDao
import com.example.kotlin.Data.Repository.UserRepository
import com.example.kotlin.Domain.Usecase.CreateUser
import com.example.kotlin.Domain.Usecase.GetUser
import com.example.kotlin.Presentation.Main.first.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule: Module = module{
    factory {
        MainViewModel(
            get(),
            get()
        )
    }
}

val domainModule: Module = module {
    factory { CreateUser(get()) }
    factory { GetUser(get()) }
}

val dataModule : Module = module {
    single { UserRepository(get()) }
    single { createDataBase(androidContext())}
}

fun createDataBase(context: Context): DatabaseDao {
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "userDB"
    )
            .fallbackToDestructiveMigration()
            .build()
    return appDatabase.dataBaseDao()
}



