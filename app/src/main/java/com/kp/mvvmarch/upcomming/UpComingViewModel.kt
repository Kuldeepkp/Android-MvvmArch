package com.kp.mvvmarch.upcomming

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class UpComingViewModel @Inject constructor(private val mUpComingRepository: UpComingRepository) : ViewModel() {

    fun doGetUpcomingData() = mUpComingRepository.doGetUpcomingData(1)
}