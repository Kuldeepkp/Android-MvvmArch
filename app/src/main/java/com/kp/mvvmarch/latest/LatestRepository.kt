package com.kp.mvvmarch.latest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class LatestRepository @Inject constructor() {

    @Inject
    lateinit var mLatestApi: LatestApi

    private var mLatestLiveData: MutableLiveData<ServiceResponse> = MutableLiveData()

    fun doGetLatestData(page:Int){
        mLatestApi.doGetLatestMovies(page).enqueue(object : Callback<ServiceResponse> {
            override fun onFailure(call: Call<ServiceResponse>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<ServiceResponse>,
                response: Response<ServiceResponse>
            ) {
                mLatestLiveData.value = response.body()
            }
        })
    }

    fun doGetData(): LiveData<ServiceResponse>{
        return mLatestLiveData
    }
}