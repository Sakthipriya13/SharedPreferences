package com.example.sharedpreferenceapplication.data.preferences

import android.content.Context
import android.content.SharedPreferences
import com.example.sharedpreferenceapplication.model.User

class UserPreferences(context: Context) {
    var pref=context.getSharedPreferences("USER_PREF", Context.MODE_PRIVATE)

    var userName : String?
        get() =pref.getString("USERNAME","")
        set(value) = pref.edit().putString("USERNAME", value).apply()
    var passWord : String?
        get() = pref.getString("PASSWORD","")
        set(value) = pref.edit().putString("PASSWORD",value).apply()
    var isAdult: Boolean?
        get() = pref.getBoolean("IS_ADULT",false)
        set(value) = pref.edit().putBoolean("IS_ADULT", value == true).apply()

    fun clear(){
        pref.edit().clear().apply()
    }

    fun loadUserDetails(): User {
        var user= User(userName, passWord,isAdult)
        return user
    }
}

