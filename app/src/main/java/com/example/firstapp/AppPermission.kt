package com.example.firstapp

import android.Manifest
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

class AppPermission : AppCompatActivity() {
    lateinit var reqCam: ActivityResultLauncher<String>
    lateinit var imgCap: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_permission)

        var pBtn = findViewById<Button>(R.id.CperBtn)

        reqCam = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                Toast.makeText(applicationContext, "Permission Granted", Toast.LENGTH_LONG).show()
                val camint = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                imgCap.launch(camint)

            } else
                Toast.makeText(applicationContext, "Permission Denied", Toast.LENGTH_LONG).show()
        }

        imgCap=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode==Activity.RESULT_OK)
            {
                handlecameraImage(it.data)
            }
        }
        pBtn.setOnClickListener {

            callPermission()
        }
    }

    fun handlecameraImage(intent: Intent?){
        var ivw =findViewById<ImageView>(R.id.imgcam)
        val bitmap=intent?.extras?.get("data") as Bitmap
        ivw.setImageBitmap(bitmap)
    }

    fun callPermission(){
        when{
            ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)==PackageManager.PERMISSION_GRANTED ->{
                Toast.makeText(applicationContext,"Permission Already Granted",Toast.LENGTH_LONG).show()
                val camint = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                imgCap.launch(camint)
            }
            else->{
                reqCam.launch(android.Manifest.permission.CAMERA)
            }
        }
    }
}