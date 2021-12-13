package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class CheckBoxEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_ex)


        val pizza =findViewById<CheckBox>(R.id.chBox1)
        val burger =findViewById<CheckBox>(R.id.chBox2)
        val sandwich =findViewById<CheckBox>(R.id.chBox3)
        val btnsub1=findViewById<Button>(R.id.btnSub1)
        val txtOut=findViewById<TextView>(R.id.txtOut)

        btnsub1.setOnClickListener {
            var amount:Int =0
            if(pizza.isChecked) {
                amount += 100
            }
            if(burger.isChecked)
                amount+=200
            if(sandwich.isChecked)
                amount+=150

            var out:String = amount.toString()
            txtOut.text="Total bill is $out"
        }

    }
}