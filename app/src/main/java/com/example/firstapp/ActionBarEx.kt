package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast

class ActionBarEx : AppCompatActivity() {
    lateinit var tv :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar_ex)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu,menu)
        val item =menu?.findItem(R.id.ab_search)
        val searchview = item?.actionView as SearchView
        searchview.queryHint="Search for People"

        searchview.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                Toast.makeText(applicationContext,p0,Toast.LENGTH_LONG).show()
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                Toast.makeText(applicationContext,p0,Toast.LENGTH_LONG).show()
                return true
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id =item.itemId

        return when(id){
            R.id.ab_add->{
                tv =findViewById(R.id.abTv)
                tv.setText("Add is clicked")
                return true
            }

            R.id.ab_reset->{
                tv =findViewById(R.id.abTv)
                tv.setText("Reset is clicked")
                return true
            }

            R.id.ab_about->{
                tv =findViewById(R.id.abTv)
                tv.setText("Info is clicked")
                return true
            }

            R.id.ab_none->{
                tv =findViewById(R.id.abTv)
                tv.setText("None is clicked")
                return true
            }

            R.id.ab_exit->{
                finish()
                return true
            }
            else-> super.onOptionsItemSelected(item)
        }
    }


}