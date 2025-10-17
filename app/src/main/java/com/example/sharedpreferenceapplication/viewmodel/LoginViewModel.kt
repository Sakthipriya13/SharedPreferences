package com.example.sharedpreferenceapplication.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sharedpreferenceapplication.data.repository.UserRepository
import com.example.sharedpreferenceapplication.model.User
import kotlinx.coroutines.launch

class LoginViewModel(var userRepository: UserRepository): ViewModel() {
    //UserName
    var _userName: MutableLiveData<String?> = MutableLiveData<String?>()
    var userName : LiveData<String?> = _userName

    //Password
    var _passWord:MutableLiveData<String?> = MutableLiveData<String?>()
    var passWord : LiveData<String?> = _passWord

    //isAdult
    var _isAdult = MutableLiveData<Boolean?>()
    var isAdult : LiveData<Boolean?> = _isAdult

    var _loginStatus: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    var loginStatus : LiveData<Boolean> = _loginStatus

    fun load()
    {
        var userDetails: User=userRepository.getUserDetails()
        _userName.value=userDetails.userName
        _passWord.value=userDetails.passWord
        _isAdult.value=userDetails.isAdult

    }

    fun login()
    {
//        viewModelScope.launch {
            var user = User(userName.value,passWord.value,isAdult.value)
            Log.e("USER","USER: "+userName.value)
            var res=userRepository.userLogin(user)
            _loginStatus.value=res
//        }

    }

    fun clear()
    {
        userRepository.clearUserDetails()
    }
}