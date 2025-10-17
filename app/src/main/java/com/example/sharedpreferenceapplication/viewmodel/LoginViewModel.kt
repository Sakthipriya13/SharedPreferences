package com.example.sharedpreferenceapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    //UserName
    var _userName = MutableLiveData<String>()
    var userName : LiveData<String> = _userName

    //Password
    var _passWord = MutableLiveData<String>()
    var passWord : LiveData<String> = _passWord

    //isAdult
    var _isAdult = MutableLiveData<Boolean>()
    var isAdult : LiveData<Boolean> = _isAdult

    fun load()
    {

    }

    fun login()
    {

    }

    fun clear()
    {

    }
}