package com.example.firstapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExplicitIntentDataTransferSecond : AppCompatActivity() {

    lateinit var sendResBtn:Button
    lateinit var resultEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent_data_transfer_second)

        sendResBtn =findViewById(R.id.sendResultButton)
        resultEditText = findViewById(R.id.resultEditText)

        sendResBtn.setOnClickListener {
            setActivityResult()
            finish()
        }
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        super.onBackPressed()
    }

    private fun setActivityResult(){
        val intent =Intent()
        var out:String =resultEditText.text.toString()
        var output:String="The result is : $out"
        intent.putExtra("result",output)
        setResult(Activity.RESULT_OK,intent)
    }
}