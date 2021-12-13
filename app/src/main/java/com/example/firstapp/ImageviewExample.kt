package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageviewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageview_example)

        val monkey =findViewById<ImageView>(R.id.monkey)
        val andro = findViewById<ImageView>(R.id.android)
        val l1 = findViewById<ImageView>(R.id.ls1)
        val l2 = findViewById<ImageView>(R.id.ls2)
        val l3 = findViewById<ImageView>(R.id.ls3)


        monkey.setOnClickListener {
            Toast.makeText(applicationContext,"Monkey Picture",Toast.LENGTH_LONG).show()
        }

        andro.setOnClickListener {
            Toast.makeText(applicationContext,"Android Picture",Toast.LENGTH_LONG).show()
        }

        l1.setOnClickListener {
            Toast.makeText(applicationContext,"Landscape 1",Toast.LENGTH_LONG).show()
        }

        l2.setOnClickListener {
            Toast.makeText(applicationContext,"Landscape 2",Toast.LENGTH_LONG).show()
        }
        l3.setOnClickListener {
            Toast.makeText(applicationContext,"Landscape 3",Toast.LENGTH_LONG).show()
        }
    }
}