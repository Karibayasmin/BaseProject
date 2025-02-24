package com.kariba.baseproject.core

import android.Manifest
import android.os.Build

fun BaseFragment.onImagePickFromCamera() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        requestCameraPermissionLauncher.launch(
            arrayOf(
                Manifest.permission.CAMERA
            )
        )
    } else {
        requestCameraPermissionLauncher.launch(
            arrayOf(
                Manifest.permission.CAMERA,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
        )
    }
}
fun BaseFragment.onImagePickFromGallery() {
    galleryImageSelectedLauncher.launch("image/*")
}

fun BaseFragment.onContactLoadFromDevice(){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        requestContactPermissionLauncher.launch(
            arrayOf(
                Manifest.permission.READ_CONTACTS
            )
        )
    }
}