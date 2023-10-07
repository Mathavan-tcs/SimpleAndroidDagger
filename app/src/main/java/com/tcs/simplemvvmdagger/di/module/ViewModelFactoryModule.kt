package com.tcs.simplemvvmdagger.di.module

import androidx.lifecycle.ViewModelProvider
import com.tcs.simplemvvmdagger.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}