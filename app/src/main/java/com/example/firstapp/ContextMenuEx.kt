package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ContextMenuEx : AppCompatActivity() {
     var listview :ListView? =null
    var adap :ArrayAdapter<String>?=null
    var con = arrayOf("Sanju","Sandeep","Lucky","David","Xavier")
    var str :String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu_ex)

        listview=findViewById(R.id.lv1)
        adap = ArrayAdapter(this,android.R.layout.simple_list_item_1,con)
        listview?.adapter=adap
        registerForContextMenu(listview)


        listview?.setOnItemClickListener{adapterView,view,i,which->
            str=con[i]
        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
            inflater.inflate(R.menu.context_menu,menu)
        menu?.setHeaderTitle("Action")

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        if (item.itemId==R.id.call)
            Toast.makeText(applicationContext,"Calling $str",Toast.LENGTH_LONG).show()
        else if(item.itemId==R.id.sms)
            Toast.makeText(applicationContext,"Messaging $str",Toast.LENGTH_LONG).show()
        else
            return false
        return true
    }
}