package com.example.sharedpreferenceapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sharedpreferenceapplication.data.preferences.UserPreferences
import com.example.sharedpreferenceapplication.data.repository.UserRepository
import com.example.sharedpreferenceapplication.model.User
import com.example.sharedpreferenceapplication.model.UserSecretCode


class SecondViewModel(var userRepository: UserRepository) : ViewModel() {
//    var _userSecretCode = MutableLiveData<String?>()
//    var userSecretCode : LiveData<String?> = _userSecretCode
//
//    var _result = MutableLiveData<Boolean?>()
//    var result : LiveData<Boolean?> = _result
//
//    fun fnEnterUserSecretCode(){
//        var userName = userRepository.getUserName();
//        var user= UserSecretCode(userName,userSecretCode.value)
//        var res=userRepository.fnStoreUserSecretCode(user)
//        _result.value=res
//    }

}