package com.tushar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.messagedilogelibrary.AlertMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlertMessage.showmessage(this,"Scuess","Your data has been pushed")
    }
}