package com.kariba.baseproject.core.popup.dialogs

import com.example.topiconcameraandgallery.databinding.AlertDialogPermissionBinding
import com.kariba.baseproject.core.popup.BaseDialogFragment

class NoPermissionDialog() : BaseDialogFragment<AlertDialogPermissionBinding>() {
    var message: String = ""

    constructor(
        message: String

    ) : this() {
        this.message = message
    }

    override fun getViewBinding(): AlertDialogPermissionBinding {
        return AlertDialogPermissionBinding.inflate(layoutInflater)
    }

    override fun viewDidCreated() {


        binding.messageText.text = message

        binding.okButton.setOnClickListener {
            dismiss()
        }

        binding.crossButton.setOnClickListener {
            dismiss()
        }


    }


}