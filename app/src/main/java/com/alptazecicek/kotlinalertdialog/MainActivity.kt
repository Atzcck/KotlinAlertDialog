package com.alptazecicek.kotlinalertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //Application Context
        //Activity Context

        Toast.makeText(applicationContext,"Welcome", Toast.LENGTH_LONG).show()

    }



    fun save (view: View) {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes") {dialog, which ->
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}