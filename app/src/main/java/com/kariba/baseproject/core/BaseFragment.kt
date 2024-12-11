package com.kariba.baseproject.core

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import com.example.topiconcameraandgallery.R
import com.kariba.baseproject.core.popup.showNoPermissionDialog
import kotlinx.coroutines.launch


abstract class BaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView(savedInstanceState)
        observeClickEvents()
        observeViewModelEvents()
        callInitialApi()
        callInitialLoadData()
    }

    abstract fun setUpView(savedInstanceState: Bundle?)
    protected open fun callInitialApi() {}

    /**
     * this method call initial of page to load pre saved data
     */
    protected open fun callInitialLoadData() {}

    abstract fun observeClickEvents()
    abstract fun observeViewModelEvents()

    val requestCameraPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { granted ->
            if (granted.all { it.value }) {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                cameraResultLauncher.launch(intent)
            } else {
                showNoPermissionDialog(getString(R.string.camera_permission))
            }
        }
    private var cameraResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.let { retrieveImageFromCamera(it) }
            }
        }

    val galleryImageSelectedLauncher =
        registerForActivityResult(ActivityResultContracts.GetContent()) { imageUri ->
            imageUri?.let {
                lifecycleScope.launch {
                    retrieveImageFromGallery(it)
                }
            }
        }

    val requestContactPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { granted ->
            if (granted.all { it.value }) {
                loadContactList()
            } else {
                showNoPermissionDialog(getString(R.string.contact_permission))
            }
        }
    protected open fun retrieveImageFromCamera(data: Intent){}
    protected open fun retrieveImageFromGallery(uri: Uri){}
    protected open fun loadContactList(){}

}