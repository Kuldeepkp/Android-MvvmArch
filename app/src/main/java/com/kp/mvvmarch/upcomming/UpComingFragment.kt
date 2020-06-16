package com.kp.mvvmarch.upcomming

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kp.mvvmarch.R
import com.kp.mvvmarch.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class UpComingFragment : DaggerFragment() {
    @Inject
    lateinit var mViewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.frament_upcomming, container, false)
        val upcomingViewModel =
            ViewModelProvider(this, mViewModelFactory)[UpComingViewModel::class.java]
        upcomingViewModel.doGetUpcomingData().observe(viewLifecycleOwner, Observer {
            Log.d("Upcoming", it.results.toString())
        })
        return mView
    }

}