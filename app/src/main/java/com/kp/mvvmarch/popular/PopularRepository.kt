package com.kp.mvvmarch.popular

import androidx.lifecycle.MutableLiveData
import com.kp.mvvmarch.ServiceResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class PopularRepository @Inject constructor() {

    @Inject
    lateinit var mPopularApi: PopularApi
    private var  mutableLiveData = MutableLiveData<ServiceResponse>()
    fun hitApiForPopularData(page:Int) : MutableLiveData<ServiceResponse> {
        mPopularApi.doGetPopularMovies(page).enqueue(object : Callback<ServiceResponse>{
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