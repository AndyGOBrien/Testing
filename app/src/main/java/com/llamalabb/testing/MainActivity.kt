package com.llamalabb.testing

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.llamalabb.testing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.viewModel = mainViewModel
        activityMainBinding.executePendingBindings()
    }
}