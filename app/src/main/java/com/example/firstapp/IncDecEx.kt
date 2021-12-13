package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IncDecEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inc_dec_ex)
        var ans : Int =0
        var t1 :String = ""

        var b1 =findViewById<Button>(R.id.Btn1)
        var b2 =findViewById<Button>(R.id.Btn2)
        var txt =findViewById<EditText>(R.id.Txt1)



        b1.setOnClickListener {
            var num = txt.text.toString().toInt()
            ans=num+1
            t1=ans.toString()
            txt.setText(t1)
        }

        b2.setOnClickListener {
            var num = txt.text.toString().toInt()
            ans=num-1
            t1=ans.toString()
            txt.setText(t1)
        }


    }
}