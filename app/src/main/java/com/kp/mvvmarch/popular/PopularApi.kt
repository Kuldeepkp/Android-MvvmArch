package com.kp.mvvmarch.popular

import com.kp.mvvmarch.Constant
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PopularApi {

    @GET(Constant.POPULAR)
    fun doGetPopularMovies(@Query("page") page :Int , @Query("api_key") mApiKey : String = Constant.API_KEY):Call<ServiceResponse>
}