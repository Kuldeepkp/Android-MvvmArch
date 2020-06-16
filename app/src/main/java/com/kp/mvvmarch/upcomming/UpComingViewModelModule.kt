package com.kp.mvvmarch.upcomming

import androidx.lifecycle.ViewModel
import com.kp.mvvmarch.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class UpComingViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(UpComingViewModel::class)
   abstract fun bindUpComingViewModel(model: UpComingViewModel):ViewModel

}