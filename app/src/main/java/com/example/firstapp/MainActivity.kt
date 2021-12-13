package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.txtName)
        val eml = findViewById<EditText>(R.id.txtEmail)
        val rno = findViewById<EditText>(R.id.txtRno)

        val btnSub = findViewById<Button>(R.id.btnSubmit)
        val btnRes = findViewById<Button>(R.id.btnReset)
        val result = findViewById<TextView>(R.id.Out)

        btnSub.setOnClickListener {
            if(name.text.toString().isEmpty() || eml.text.toString().isEmpty() || rno.text.toString().isEmpty())
            {
                result.text = "Fill All The Info"
                Toast.makeText(applicationContext, "Fill The Info ", Toast.LENGTH_SHORT).show()
            }
            else
            {
                result.text=
                    """
                        Name : ${name.text}
                        Email : ${eml.text}
                        Reg.No : ${rno.text}
                    """.trimIndent()
            }
        }

        btnRes.setOnClickListener {
            result.text=" "
            name.text.clear()
            eml.text.clear()
            rno.text.clear()
        }
    }
}