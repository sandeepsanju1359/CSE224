package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.*
import java.nio.file.attribute.AclEntry
import java.util.*

class AlertDialogueEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialogue_ex)

       var btnAlert = findViewById<Button>(R.id.btnAlert)
        btnAlert.setOnClickListener {

            val builder = Builder(this)
            builder.setTitle("Authentication Alert")
                .setMessage("Are you Sure ?")
                .setCancelable(false)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Yes",Toast.LENGTH_LONG).show()
                anotherDialog()
            }

            builder.setNeutralButton("Cancel"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked No",Toast.LENGTH_LONG).show()
            }

            val alrtdilog :AlertDialog =builder.create()
            alrtdilog.show()
        }

    }

    fun anotherDialog(){
        val builder = Builder(this)
        builder.setTitle("Login Alert")
            .setMessage("Warning")
            .setCancelable(true)
            .setIcon(android.R.drawable.ic_dialog_alert)
        val adilog :AlertDialog =builder.create()
        adilog.show()

    }
}