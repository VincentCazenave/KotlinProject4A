package com.example.kotlin.Presentation.Main.first

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.Domain.Entity.User
import com.example.kotlin.Domain.Usecase.CreateUser
import com.example.kotlin.Domain.Usecase.GetUser
import com.example.kotlin.Presentation.Main.Status.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
        private val createUser: CreateUser,
        private val getUser: GetUser
) : ViewModel() {

    val loginLiveData : MutableLiveData<LoginStatus> = MutableLiveData()
    val createLiveData : MutableLiveData<CreateUserStatus> = MutableLiveData()

    fun onClickedLogin(username: String, password: String, mail: String){
        viewModelScope.launch(Dispatchers.IO ) {
            val user = getUser.invoke(username)
            val loginStatus: LoginStatus = if(user != null){
                LoginSuccess(
                    user.username,
                    user.password,
                    user.mail
                )
            }else{
                LoginError
            }
            withContext(Dispatchers.Main){
                loginLiveData.value = loginStatus
                System.out.println(loginLiveData.value)
            }
        }

    }

    fun onClickedNew(username: String, password: String, mail: String, context: Context){
        viewModelScope.launch (Dispatchers.IO) {
            val user = getUser.invoke(username)
            val createUserStatus : CreateUserStatus = if(user != null){
                CreateError
            }else{
                CreateSuccess

            }

            if(user == null){  
                createUser.invoke(User(username, password, mail))
            }

            withContext(Dispatchers.Main){
                createLiveData.value = createUserStatus
                System.out.println(createLiveData.value)
            }

        }
    }
}
