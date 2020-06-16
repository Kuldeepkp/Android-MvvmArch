package com.kp.mvvmarch

import com.kp.mvvmarch.latest.LatestFragment
import com.kp.mvvmarch.latest.LatestModule
import com.kp.mvvmarch.latest.LatestViewModelModule
import com.kp.mvvmarch.popular.PopularFragment
import com.kp.mvvmarch.popular.PopularModule
import com.kp.mvvmarch.popular.PopularViewModelModule
import com.kp.mvvmarch.upcomming.UpComingFragment
import com.kp.mvvmarch.upcomming.UpComingModule
import com.kp.mvvmarch.upcomming.UpComingViewModelModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector(modules = [LatestModule::class, LatestViewModelModule::class])
    abstract fun contributeLatestFragment(): LatestFragment

    @ContributesAndroidInjector(modules = [PopularModule::class, PopularViewModelModule::class])
    abstract fun contributePopularFragment(): PopularFragment

    @ContributesAndroidInjector(modules = [UpComingModule::class,UpComingViewModelModule::class])
    abstract fun contributeUpcomingFragment(): UpComingFragment
}
