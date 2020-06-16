package com.kp.mvvmarch.popular

import androidx.lifecycle.ViewModel
import javax.inject.Inject


class PopularViewModel @Inject constructor(private val mPopularRepository: PopularRepository) : ViewModel() {
    fun doGetPopularData() = mPopularRepository.hitApiForPopularData(1)

}