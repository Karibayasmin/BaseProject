package com.kariba.baseproject.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

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
