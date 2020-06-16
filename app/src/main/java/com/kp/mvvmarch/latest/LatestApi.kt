package com.kp.mvvmarch.latest

import com.kp.mvvmarch.Constant
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LatestApi {
    @GET(Constant.LATEST)
    fun doGetLatestMovies(  @Query("page")page : Int, @Query("api_key") mApiKey : String = "5370eed075b93dd79855f1c429b03ad8"):Call<ServiceResponse>
}