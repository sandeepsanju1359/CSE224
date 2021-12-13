package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppchooserEximg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appchooser_eximg)

        var btn = findViewById<Button>(R.id.imgBtn)

        btn.setOnClickListener {
            var intent =Intent(Intent.ACTION_VIEW)
            intent.type="image/*"
           // intent.setDataAndType("image/*")
            startActivity(Intent.createChooser(intent,"share img"))

        }
    }
}