package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class ExplicitIntentDataTransferFirst : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_data_transfer_first)

        val getResBtn=findViewById<Button>(R.id.getResultButton)
        val txtV=findViewById<TextView>(R.id.resultTextView)

        val secActivityWithResult=registerForActivityResult(
            ActivityResultContracts.StartActivityForResult())
        {
            result: ActivityResult?->
            if(result?.resultCode== RESULT_OK)
            {
                txtV.text=result.data?.getStringExtra("result")
            }
            else if (result?.resultCode== RESULT_CANCELED)
            {
                Toast.makeText(applicationContext,"Back Button is Clicked",Toast.LENGTH_LONG).show()
            }

        }

        getResBtn.setOnClickListener {
            val intent = Intent (this,ExplicitIntentDataTransferSecond::class.java)
            secActivityWithResult.launch(intent)
        }


    }
}