package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplicitIntentExFirst : AppCompatActivity() {
    val id :Int =100
    val msg:String="Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_ex_first)

        var btn1 = findViewById<Button>(R.id.FirstBtn)
        btn1.setOnClickListener {
            val intent =Intent(this,ExplicitIntentExSecond::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("msg_value",msg)
            startActivity(intent)
        }

    }

}