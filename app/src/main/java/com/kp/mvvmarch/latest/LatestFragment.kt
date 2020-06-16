package com.kp.mvvmarch.latest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kp.mvvmarch.R
import com.kp.mvvmarch.ViewModelFactory
import com.kp.mvvmarch.databinding.FragmentLatestBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class LatestFragment : DaggerFragment() {
    @Inject
    lateinit var mViewModelFactory: ViewModelFactory
    @Inject
    lateinit var mLatestMoviesAdapter: LatestMoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLatestBinding>(
            inflater,
            R.layout.fragment_latest,
            container,
            false
        )
        binding.adapter = mLatestMoviesAdapter
        val mLatestViewModel =
            ViewModelProvider(this, mViewModelFactory)[LatestViewModel::class.java]
        mLatestViewModel.updateValue()
        mLatestViewModel.doGetData().observe(viewLifecycleOwner, Observer {
            mLatestMoviesAdapter.setData(it.results)
        })
        return binding.root
    }
}