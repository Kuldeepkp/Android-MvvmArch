package com.kp.mvvmarch.upcomming

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class UpComingRepository @Inject constructor() {

    @Inject
    lateinit var mUpcomingApi: UpcomingApi
    private var mutableLiveData = MutableLiveData<ServiceResponse>()
    fun doGetUpcomingData(page: Int): LiveData<ServiceResponse> {
        mUpcomingApi.getUpcomingData(page).enqueue(object : Callback<ServiceResponse> {
            override fun onFailure(call: Call<ServiceResponse>, t: Throwable) {
                mutableLiveData.value = null
            }

            override fun onResponse(
                call: Call<ServiceResponse>,
                response: Response<ServiceResponse>
            ) {
                mutableLiveData.value = response.body()
            }

        })
        return mutableLiveData
    }

}