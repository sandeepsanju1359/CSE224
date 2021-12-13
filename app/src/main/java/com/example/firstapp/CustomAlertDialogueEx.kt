package com.example.firstapp

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*

class CustomAlertDialogueEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialogue_ex)

        var btnSimpleAlert =findViewById<Button>(R.id.btnSimpleAlert)
        var btnAlertItems =findViewById<Button>(R.id.btnAlertItems)
        var btnMulItems=findViewById<Button>(R.id.btnMulItems)
        var btnEdtxt =findViewById<Button>(R.id.btnEdtxt)


        btnSimpleAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("Are you Sure ?")
                .setCancelable(false)
                .setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Yes", Toast.LENGTH_LONG).show()

            }

            builder.setNeutralButton("Cancel"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Cancel", Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked No", Toast.LENGTH_LONG).show()
            }

            val alrtdilog : AlertDialog =builder.create()
            alrtdilog.show()
        }

        btnAlertItems.setOnClickListener {
            var items = arrayOf("Banana","Mango","Apple","Orange","Cherry")
            val builder = AlertDialog.Builder(this)
                .setTitle("List of Fruits")
                .setItems(items){dialog,which->
                    Toast.makeText(applicationContext,items[which]+" is clicked",Toast.LENGTH_LONG).show()
                }
            builder.setPositiveButton("Yes"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Yes", Toast.LENGTH_LONG).show()

            }

            builder.setNeutralButton("Cancel"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked Cancel", Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){ dialogInterface, which->
                Toast.makeText(applicationContext,"You clicked No", Toast.LENGTH_LONG).show()
            }

            val alrtdialog =builder.create()
            alrtdialog.show()
             val b1 =alrtdialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val b2 =alrtdialog.getButton(DialogInterface.BUTTON_NEGATIVE)

            b1.setBackgroundColor(Color.CYAN)
            b2.setBackgroundColor(Color.GRAY)

            b1.setTextColor(Color.RED)
            b2.setTextColor(Color.RED)


        }

        btnMulItems.setOnClickListener {
            var items = arrayOf("Banana","Mango","Apple","Orange","Cherry")
            var selected= ArrayList<String>()
            val builder =AlertDialog.Builder(this)
                .setTitle("Multichoice Items")
                .setMultiChoiceItems(items,null){dialog,i,isChecked->
                    if (isChecked)
                        selected.add(items[i])
                    else if (selected.contains(items[i]))
                        selected.remove(items[i])
                }
                .setPositiveButton("Done"){dialog,which->
                    Toast.makeText(applicationContext,"Items selected are : "+
                            Arrays.toString(selected.toTypedArray()),Toast.LENGTH_LONG).show()
                }
            builder.show()
        }

        btnEdtxt.setOnClickListener {
            val builder =AlertDialog.Builder(this)
            builder.setTitle("Write your Text")
            val inp=EditText(this)
            val lp=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)
            inp.layoutParams=lp
                builder.setView(inp)
                   builder.setPositiveButton("OK"){dialog,which->
                       Toast.makeText(applicationContext,"Text Entered is : "+inp.text.toString(),
                       Toast.LENGTH_LONG).show()
                   }
            builder.show()
        }

    }
}