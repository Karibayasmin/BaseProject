package com.kariba.topiconcameraandgallery.core

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.topiconcameraandgallery.R

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpView(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        observeClickEvents()
        observeViewModelEvents()
    }

    abstract fun observeViewModelEvents()

    abstract fun observeClickEvents()

    abstract fun setUpView(savedInstanceState: Bundle?)
}
