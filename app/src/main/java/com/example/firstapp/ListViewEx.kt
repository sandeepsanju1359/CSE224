package com.example.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.core.graphics.toColorInt

class ListViewEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_ex)

        val lstvw=findViewById<ListView>(R.id.lstvw)
        //var items = arrayOf("Apple","Banana","Orange","Cherry","Guava")
        //val clr = arrayOf(Color.RED,Color.BLUE,Color.CYAN,Color.GREEN)
        val clrs = arrayOf("RED","BLUE","CYAN","GREEN")
        val ll = findViewById<LinearLayout>(R.id.ll)
       /* var ad = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)

        lstvw.adapter=ad
        lstvw.setOnItemClickListener { adapterView, view, i, id ->
            val str = adapterView.getItemAtPosition(i) as String
            Toast.makeText(applicationContext,"Yo selected : $str",Toast.LENGTH_LONG).show()*/
        val ad = ArrayAdapter(this,android.R.layout.simple_list_item_1,clrs)

        lstvw.adapter=ad
        lstvw.setOnItemClickListener { adapterView, view, i, id ->
           //val str = adapterView.getItemAtPosition(i) as String
           // Toast.makeText(applicationContext,"Yo selected : $str",Toast.LENGTH_LONG).show()
           ll.setBackgroundColor(clrs[i].toColorInt())

        }
    }
}