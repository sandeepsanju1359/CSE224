package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ExplicitIntentExSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_ex_second)

        val btn2 =findViewById<Button>(R.id.SecondBtn)

        val bundle:Bundle? =intent.extras
        val id = bundle?.get("id_value")
        val msg = bundle?.get("msg_value")
        Toast.makeText(applicationContext,id.toString()+" "+msg,Toast.LENGTH_LONG).show()


        btn2.setOnClickListener {
            val intent = Intent(this, ExplicitIntentExFirst::class.java)
            startActivity(intent)
        }
    }
}