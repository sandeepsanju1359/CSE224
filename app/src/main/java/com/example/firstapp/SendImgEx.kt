package com.example.firstapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SendImgEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_img_ex)

        var iv =findViewById<ImageView>(R.id.imageView)

        val bundle:Bundle? =intent.extras
        val id = bundle?.get("image")

        iv.setImageURI(id as Uri?)

    }
}