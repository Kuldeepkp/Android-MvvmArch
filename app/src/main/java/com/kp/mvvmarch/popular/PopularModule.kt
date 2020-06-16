package com.kp.mvvmarch.popular

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class PopularModule {

    @Provides
    fun providePopularApi(mRetrofit: Retrofit) : PopularApi{
        return mRetrofit.create(PopularApi::class.java)
    }
}