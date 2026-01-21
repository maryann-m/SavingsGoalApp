package com.example.sample21.utils

import android.R
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.sample21.databinding.AppHeaderBinding
import com.example.sample21.databinding.DialogConfirmBinding

private lateinit var dialogBuilder: AlertDialog.Builder
private var confirmDialog: AlertDialog? = null




fun Fragment.showDialog(

    title: String,
    action: (() -> Unit)? = null
) {

    dialogBuilder = AlertDialog.Builder(requireContext())
    val inflater =
        requireContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val bind: DialogConfirmBinding = DialogConfirmBinding.inflate(inflater)
    dialogBuilder.setView(bind.root)
    confirmDialog = dialogBuilder.create()
    confirmDialog?.window?.setBackgroundDrawable(ColorDrawable(R.color.transparent))
    confirmDialog?.setCancelable(false)

    bind.tv1.text = title
    bind.btnConfirm.setOnClickListener {
        if(action != null){
            action.invoke()
        }
        confirmDialog?.dismiss()
    }


    confirmDialog!!.show()
}

fun Fragment.setUpHeader(
    layout: AppHeaderBinding,
    title: String,
    action: () -> Unit
) {

    layout.apply {
        imageBack.setOnClickListener { action.invoke() }
        itvHeader.setText(title)
    }

}