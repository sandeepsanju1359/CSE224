package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class PopUpMenuEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu_ex)

        var btnpopup =findViewById<Button>(R.id.btnpopup)

        btnpopup.setOnClickListener {
            val popup = PopupMenu(this,btnpopup)
            popup.menuInflater.inflate(R.menu.popupmenu,popup.menu)

            popup.setOnMenuItemClickListener {

                Toast.makeText(applicationContext,"Option Clicked : "+it.title, Toast.LENGTH_LONG).show()
                if (it.title=="Search")
                {
                    var url:String ="https://www.google.co.in/"
                val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
                }
                true
            }




            popup.show()
        }
    }
}