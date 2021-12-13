package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class ImplicitIntentEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_ex)

        val txt1=findViewById<EditText>(R.id.urlText)
        val navBtn=findViewById<Button>(R.id.btnNavigate)
        val camBtn=findViewById<Button>(R.id.btnCamera)
        val callBtn=findViewById<Button>(R.id.call)
        val conBtn=findViewById<Button>(R.id.contact)
        val galBtn=findViewById<Button>(R.id.gallery)
        val dailBtn=findViewById<Button>(R.id.dialler)


        navBtn.setOnClickListener {
            var url:String =txt1.text.toString()
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
        }

        camBtn.setOnClickListener {
            val camera_intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera_intent)
        }

        callBtn.setOnClickListener {
            val intentCallLog = Intent(Intent.ACTION_VIEW)
            intentCallLog.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(intentCallLog)
        }
        conBtn.setOnClickListener {
            val contIntent = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(contIntent)
        }
        galBtn.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.type = "image/*"
            startActivity(intent)
        }
        dailBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel: +917995173344"))
            startActivity(intent)
        }


    }
}