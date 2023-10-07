package com.tcs.simplemvvmdagger.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.tcs.simplemvvmdagger.model.LoginUseCase
import com.tcs.simplemvvmdagger.model.UserData
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val loginUseCase: LoginUseCase,
) : ViewModel() {

    fun doLogin() {
        // doing some thing
        Log.v("doLogin", "Do logging is calling now")
        val userData = loginUseCase.storeUserDetails()
        for (user in userData) {
            Log.v("user detail-->", "user details --> ${user.designation}")
            Log.v("user detail-->", "user details --> ${user.id}")
            Log.v("user detail-->", "user details --> ${user.name}")
            Log.v("user detail-->", "user details --> ${user.job}")
        }
    }
}