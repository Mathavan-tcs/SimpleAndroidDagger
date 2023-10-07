package com.tcs.simplemvvmdagger.di.module

import com.tcs.simplemvvmdagger.model.LoginRepository
import com.tcs.simplemvvmdagger.model.LoginRepositoryImplementation
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorageModule(storage: LoginRepositoryImplementation): LoginRepository
}