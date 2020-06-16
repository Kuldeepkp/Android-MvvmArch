package com.kp.mvvmarch.popular

import androidx.lifecycle.ViewModel
import com.kp.mvvmarch.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PopularViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PopularViewModel::class)
    abstract fun bindPopularViewModel(mPopularViewModel: PopularViewModel) : ViewModel
}