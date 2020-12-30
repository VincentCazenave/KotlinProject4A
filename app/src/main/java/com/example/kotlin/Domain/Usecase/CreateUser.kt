package com.example.kotlin.Domain.Usecase

import com.example.kotlin.Data.Repository.UserRepository
import com.example.kotlin.Domain.Entity.User

class CreateUser(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}