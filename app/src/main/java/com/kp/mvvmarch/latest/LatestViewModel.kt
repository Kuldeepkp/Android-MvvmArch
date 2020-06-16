package com.kp.mvvmarch.latest

import androidx.lifecycle.ViewModel
import javax.inject.Inject


class LatestViewModel @Inject constructor(private val mLatestRepository: LatestRepository) : ViewModel() {

    fun updateValue() = mLatestRepository.doGetLatestData(1)
    fun doGetData()  = mLatestRepository.doGetData()
}