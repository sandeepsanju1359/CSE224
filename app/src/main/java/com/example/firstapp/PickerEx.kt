package com.example.firstapp

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import java.net.URI

class PickerEx : AppCompatActivity() {
    lateinit var iuri:Uri
    lateinit var reqPer :ActivityResultLauncher<String>
    lateinit var ldimg : ActivityResultLauncher<Intent>
    lateinit var getimg :ActivityResultLauncher<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker_ex)


        val imgV=findViewById<ImageView>(R.id.imgV)
        val Btnq=findViewById<Button>(R.id.BtnClick)
        val bt =findViewById<Button>(R.id.BtnSend)

         reqPer = registerForActivityResult(ActivityResultContracts.RequestPermission()){
            if (it){
                Toast.makeText(applicationContext,"Permission Granted",Toast.LENGTH_LONG).show()
               getimg.launch("image/*")
            }
            else
            {
                Toast.makeText(applicationContext,"Permission Not Granted",Toast.LENGTH_LONG).show()
            }
        }



          getimg= registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                iuri =it
                imgV.setImageURI(iuri)
            }
        )

        Btnq.setOnClickListener {
            callPermission()

        }

        bt.setOnClickListener {

            val intent=Intent(this,SendImgEx::class.java)
            intent.putExtra("image",iuri)
            startActivity(intent)
        }



    }

   /* fun Loadimage(intent: Intent?){
        val imgV=findViewById<ImageView>(R.id.imgV)
         iuri= intent?.extras?.get("data") as Uri
        imgV.setImageURI(iuri)
    }*/

    fun callPermission(){
        when{
            ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED ->{
                Toast.makeText(applicationContext,"Permission Already Granted",Toast.LENGTH_LONG).show()
                getimg.launch("image/*")
            }
            else->{
                reqPer.launch(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            }
        }
    }
}