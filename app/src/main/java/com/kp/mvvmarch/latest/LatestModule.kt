package com.kp.mvvmarch.latest

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class LatestModule {

    @Provides
    fun providesLatestApi(mRetrofit: Retrofit):LatestApi{
        return mRetrofit.create(LatestApi::class.java)
    }

    @Provides
    fun  provideLatestAdapter() : LatestMoviesAdapter{
        return LatestMoviesAdapter(ArrayList())
    }
}