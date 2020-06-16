package com.kp.mvvmarch.upcomming

import com.kp.mvvmarch.Constant
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UpcomingApi {

    @GET(Constant.UPCOMING)
    fun getUpcomingData(@Query("page") mPage:Int, @Query("api_key") mApiKey : String = Constant.API_KEY) : Call<ServiceResponse>
}