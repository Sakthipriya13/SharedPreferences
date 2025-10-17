package com.example.sharedpreferenceapplication.data.repository

import android.util.Log
import com.example.sharedpreferenceapplication.data.preferences.UserPreferences
import com.example.sharedpreferenceapplication.model.User

class UserRepository (var userPreferences: UserPreferences){

    fun userLogin(user: User): Boolean
    {
        Log.e("USER","USER: "+user)
        return if(user.userName?.isNotEmpty() == true && user.passWord?.isNotEmpty() == true)
        {
            userPreferences.userName=user.userName
            userPreferences.passWord=user.passWord
            userPreferences.isAdult=user.isAdult
            true
        }
        else{
            false
        }

    }

    fun getUserDetails():User{
//        var user=User(userPreferences.userName,userPreferences.passWord,userPreferences.isAdult)
        return userPreferences.loadUserDetails()
    }

    fun clearUserDetails(){
        userPreferences.clear()
    }
}