package com.example.kotlin.injection

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val str : MutableLiveData<String> = MutableLiveData()

    init{
        str.value="De la liveData!"
    }
}