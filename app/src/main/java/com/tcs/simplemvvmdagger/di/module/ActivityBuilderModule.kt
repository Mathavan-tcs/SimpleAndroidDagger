package com.tcs.simplemvvmdagger.di.module

import com.tcs.simplemvvmdagger.LoginActivity
import com.tcs.simplemvvmdagger.di.AppScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @AppScope
    @ContributesAndroidInjector(
        modules = [ViewModelModule::class]
    )
    abstract fun contributeLoginActivity(): LoginActivity
}
