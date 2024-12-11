package com.kariba.baseproject.ui.feature1.activities

import android.os.Bundle
import com.example.topiconcameraandgallery.databinding.ActivityMainBinding
import com.kariba.baseproject.core.BaseActivity

class MainActivity : BaseActivity() {

    lateinit var activityBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)

        setSupportActionBar(activityBinding.toolbar.root)

    }

    override fun observeViewModelEvents() {

    }

    override fun observeClickEvents() {

    }

    override fun setUpView(savedInstanceState: Bundle?) {

    }
}