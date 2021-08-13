package com.tushar.messagedilogelibrary

import android.app.AlertDialog
import android.content.Context

object AlertMessage {

    fun showmessage(contest:Context,title:String,message:String)
    {

        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(contest)
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.setPositiveButton("yes"
        ) { _, _ ->

        }
        alertDialog.setNegativeButton(
            "No"
        ) { _, _ -> }
        val alert: AlertDialog = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        alert.show()
    }
}