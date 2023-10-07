package com.tcs.simplemvvmdagger

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.tcs.simplemvvmdagger.viewmodel.LoginViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class LoginActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val loginViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[LoginViewModel::class.java]
    }

    @Inject
    lateinit var test: String

    @Inject
    @Named("First_Name")
    lateinit var firstname: String

    @Inject
    @Named("Last_Name")
    lateinit var lastName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("test some thing", test)
        Log.v("First name -->", firstname)
        Log.v("First name -->", lastName)

        loginViewModel.doLogin()

    }
}