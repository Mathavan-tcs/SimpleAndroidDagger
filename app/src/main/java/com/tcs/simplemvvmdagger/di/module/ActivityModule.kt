package com.tcs.simplemvvmdagger.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityModule {

    companion object {

        @Provides
        fun someTestString(): String {
            return "Hello World"
        }


        @Provides
        @Named("First_Name")
        fun provideFirstNameString(): String = "Mathavan"

        @Provides
        @Named("Last_Name")
        fun provideLastNameString(): String = "Kaliyaperumal"

    }
}

