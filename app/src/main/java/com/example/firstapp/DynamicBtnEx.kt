package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class DynamicBtnEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_btn_ex)
        var lnlt=findViewById<LinearLayout>(R.id.linLayout)
        var b1=findViewById<Button>(R.id.b1)

        b1.setOnClickListener {
            var b2 :Button = Button(this)
            b2.text="Dy New Btn"

            b2.layoutParams =LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            var lbl :TextView = TextView(this)
            lbl.text="New Btn Created"
            lbl.layoutParams =LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            b2.setOnClickListener {
                Toast.makeText(applicationContext,"New Dynamic Button",Toast.LENGTH_LONG).show()
            }

            lnlt.addView(b2)
            lnlt.addView(lbl)

        }



    }
}