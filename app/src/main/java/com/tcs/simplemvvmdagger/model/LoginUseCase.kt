package com.tcs.simplemvvmdagger.model

import android.util.Log
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val loginRepository: LoginRepository) {

    fun storeUserDetails(): List<UserData> {
        Log.v("User data manager ", "User data stored successfully in the user data manager")
        return loginRepository.connectLoginAPI()
    }
}