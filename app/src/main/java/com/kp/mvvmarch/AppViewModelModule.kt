package com.kp.mvvmarch

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class AppViewModelModule {
    @Binds
   abstract fun bindViewModelFactory(mViewModelFactory: ViewModelFactory) : ViewModelProvider.Factory
}