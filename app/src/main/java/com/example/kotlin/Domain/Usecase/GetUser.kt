package com.example.kotlin.Domain.Usecase

import com.example.kotlin.Data.Local.Models.UserLocal
import com.example.kotlin.Data.Repository.UserRepository
import com.example.kotlin.Domain.Entity.User

class GetUser(
        private val userRepository: UserRepository
) {

    suspend fun invoke(username: String): User? {
        return userRepository.getUser(username)
    }
}