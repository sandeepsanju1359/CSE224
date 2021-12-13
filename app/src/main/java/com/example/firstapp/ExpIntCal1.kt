package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ExpIntCal1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp_int_cal1)


        var num1 =findViewById<EditText>(R.id.txtNum1)
        var num2 =findViewById<EditText>(R.id.txtNum2)

        //var n1 =num1.text.toString().toInt()
        var n1 : Int = 10
       // var n2 =num2.text.toString().toInt()



        var entBtn=findViewById<Button>(R.id.btnEnter)

        entBtn.setOnClickListener {
            Toast.makeText(applicationContext,n1,Toast.LENGTH_LONG).show()
            val intent =Intent(this,ExpIntCal2::class.java)
            intent.putExtra("addition",n1)
           // intent.putExtra("subtraction",n2)
           // intent.putExtra("multiplication",n1*n2)
            //intent.putExtra("division",n1/n2)
            startActivity(intent)


        }





    }
}