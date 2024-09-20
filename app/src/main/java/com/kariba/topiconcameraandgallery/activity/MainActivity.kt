package com.kariba.topiconcameraandgallery.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.topiconcameraandgallery.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    lateinit var activityBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)
    }
}