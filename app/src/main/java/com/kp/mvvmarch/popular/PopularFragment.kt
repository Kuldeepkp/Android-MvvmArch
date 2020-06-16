package com.kp.mvvmarch.popular

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kp.mvvmarch.R
import com.kp.mvvmarch.ViewModelFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class PopularFragment : DaggerFragment() {
    @Inject
    lateinit var mViewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mView = inflater.inflate(R.layout.fragment_popular,container,false)
        var popularViewModel = ViewModelProvider(this,mViewModelFactory)[PopularViewModel::class.java]
        popularViewModel.doGetPopularData().observe(viewLifecycleOwner, Observer {
            Log.d("Popular",it.results.toString())
        })
        return mView
    }
}