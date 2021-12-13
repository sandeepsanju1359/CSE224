package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppChooserEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_chooser_ex)

        var btn1 =findViewById<Button>(R.id.chBtn1)
        var btn2 =findViewById<Button>(R.id.chBtn2)

        btn1.setOnClickListener {
            val loc = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
            var mapIntent = Intent(Intent.ACTION_VIEW,loc)
            startActivity(mapIntent)
        }

        btn2.setOnClickListener {
            var url = "https://www.google.co.in/"
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url),"text/html")
            var choose = Intent.createChooser(intent,"Share url")
            startActivity(choose)

        }
    }
}