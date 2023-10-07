package com.tcs.simplemvvmdagger.model

interface LoginRepository {
    fun connectLoginAPI():List<UserData>
}