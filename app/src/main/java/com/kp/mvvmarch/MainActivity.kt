package com.kp.mvvmarch

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.kp.mvvmarch.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val navController = Navigation.findNavController(this, R.id.mainNavigationFragment)
        NavigationUI.setupWithNavController(mainActivityMainBinding.bottomNavigationView,navController)
        //NavigationUI.setupActionBarWithNavController(this, navController)
    }
}
