package com.kariba.baseproject.core.popup

import androidx.fragment.app.Fragment
import com.kariba.baseproject.core.popup.dialogs.NoPermissionDialog

fun Fragment.showNoPermissionDialog(
    message: String ) {
    val dialog = NoPermissionDialog().apply {
        this.message = message
    }
    try {
        dialog.show(childFragmentManager, "ShowNoPermissionDialog")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}