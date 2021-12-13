package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ExpIntCal2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exp_int_cal2)
        var ans:Double = 0.0


        var addBtn=findViewById<Button>(R.id.btnAdd)
        var subBtn=findViewById<Button>(R.id.btnSub)
        var mulBtn=findViewById<Button>(R.id.btnMul)
        var divBtn=findViewById<Button>(R.id.btnDiv)
       // var res =findViewById<TextView>(R.id.Out)

        val bundle:Bundle? =intent.extras
        val n1 = bundle?.get("addition")
        val n2 = bundle?.get("subtraction")
        //val n3 = bundle?.get("multiplication")
        //val n4 = bundle?.get("division")

        addBtn.setOnClickListener {
            Toast.makeText(applicationContext,n1.toString(),Toast.LENGTH_LONG).show()
        }


      /*  addBtn.setOnClickListener {

            var num1 : Double =n1.toString().toDouble()
            var num2 : Double = n2.toString().toDouble()


            ans = num1 + num2

           // res.text= ans1
            Toast.makeText(applicationContext,ans.toString(),Toast.LENGTH_LONG).show()


        }

        subBtn.setOnClickListener {

            var num1 : Double =n1.toString().toDouble()
            var num2 : Double = n2.toString().toDouble()

            ans= num1 - num2

           // res.text= ans1
            Toast.makeText(applicationContext,ans.toString(),Toast.LENGTH_LONG).show()

        }

        mulBtn.setOnClickListener {

            var num1 : Double =n1.toString().toDouble()
            var num2 : Double = n2.toString().toDouble()

            ans= num1 * num2

           // res.text= ans1
            Toast.makeText(applicationContext,ans.toString(),Toast.LENGTH_LONG).show()

        }

        divBtn.setOnClickListener {

            var num1 : Double =n1.toString().toDouble()
            var num2 : Double = n2.toString().toDouble()

            ans= num1 / num2

           // res.text=  ans1
            Toast.makeText(applicationContext,ans.toString(),Toast.LENGTH_LONG).show()

        }*/
    }
}

