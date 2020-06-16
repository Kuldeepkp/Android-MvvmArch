package com.kp.mvvmarch.upcomming

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class UpComingModule {

    @Provides
    fun providesUpComingApi(mRetrofit: Retrofit) : UpcomingApi{
        return mRetrofit.create(UpcomingApi::class.java)
    }
}