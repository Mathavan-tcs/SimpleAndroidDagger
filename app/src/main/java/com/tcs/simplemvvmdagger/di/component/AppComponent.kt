package com.tcs.simplemvvmdagger.di.component

import android.app.Application
import com.tcs.simplemvvmdagger.MyApplication
import com.tcs.simplemvvmdagger.di.module.ActivityBuilderModule
import com.tcs.simplemvvmdagger.di.module.ActivityModule
import com.tcs.simplemvvmdagger.di.module.NetworkModule
import com.tcs.simplemvvmdagger.di.module.StorageModule
import com.tcs.simplemvvmdagger.di.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBuilderModule::class,
        ActivityModule::class,
        ViewModelFactoryModule::class,
        StorageModule::class,
        NetworkModule::class,
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}