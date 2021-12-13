package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class OptionMenuEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu_ex)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId


        return when(id) {
            R.id.play->{
                Toast.makeText(applicationContext,"Clicked Play",Toast.LENGTH_LONG).show()
                true
            }
            R.id.pause->{
                Toast.makeText(applicationContext,"Clicked Pause",Toast.LENGTH_LONG).show()
                true
            }
            R.id.settings->{
                Toast.makeText(applicationContext,"Clicked Settings",Toast.LENGTH_LONG).show()
                true
            }

            R.id.exit->{
                finish()
                true
            }
            else->super.onOptionsItemSelected(item)
        }


    }
}