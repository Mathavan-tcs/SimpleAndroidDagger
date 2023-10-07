package com.tcs.simplemvvmdagger.model

import android.util.Log
import javax.inject.Inject

class LoginRepositoryImplementation @Inject constructor(

) : LoginRepository {
    override fun connectLoginAPI(): List<UserData> {
        Log.v("LoginRepositoryImplementation", " Login api connected successfully successfully")
        return listOf(
            UserData(
                id = 1,
                name = "aaa",
                job = "",
                designation = "c3a",
                emailId = "ccc@gmail.com"
            ),
            UserData(
                id = 2,
                name = "aaa",
                job = "",
                designation = "c3a",
                emailId = "ccc@gmail.com"
            ),
            UserData(
                id = 3,
                name = "aaa",
                job = "",
                designation = "c3a",
                emailId = "ccc@gmail.com"
            )
        )
    }
}