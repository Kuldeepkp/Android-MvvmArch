package com.kp.mvvmarch.latest

import androidx.lifecycle.ViewModel
import com.kp.mvvmarch.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LatestViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LatestViewModel::class)
    abstract fun bindLatestViewModel(model: LatestViewModel): ViewModel
}