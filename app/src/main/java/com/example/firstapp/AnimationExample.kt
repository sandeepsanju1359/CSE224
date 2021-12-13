package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AnimationExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_example)

        var fade_in = findViewById<Button>(R.id.fade_in)
        var fade_out=findViewById<Button>(R.id.fade_out)
        var zoom_in = findViewById<Button>(R.id.zoom_in)
        var zoom_out=findViewById<Button>(R.id.zoom_out)
        var slide_down = findViewById<Button>(R.id.slide_down)
        var slide_up=findViewById<Button>(R.id.slide_up)
        var bounce = findViewById<Button>(R.id.bounce)
        var rotate=findViewById<Button>(R.id.rotate)
        var txtView = findViewById<TextView>(R.id.textView)
        var imView = findViewById<ImageView>(R.id.img_view)


        fade_in.setOnClickListener {
            imView.visibility= View.VISIBLE
            //txtView.visibility= View.VISIBLE
            val animationfade_in = AnimationUtils.loadAnimation(this,R.anim.fade_in)
           // txtView.startAnimation(animationfade_in)
            imView.startAnimation(animationfade_in)
        }
        fade_out.setOnClickListener {
            //txtView.visibility= View.VISIBLE
            val animationfade_out = AnimationUtils.loadAnimation(this,R.anim.fade_out)
            //txtView.startAnimation(animationfade_out)
            imView.startAnimation(animationfade_out)
        }
        zoom_in.setOnClickListener {
            //txtView.visibility= View.VISIBLE
            val animationzoom_in = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            //txtView.startAnimation(animationzoom_in)
            imView.startAnimation(animationzoom_in)
        }
        zoom_out.setOnClickListener {
           // txtView.visibility= View.VISIBLE
            val animationzoom_out = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
           // txtView.startAnimation(animationzoom_out)
            imView.startAnimation(animationzoom_out)
        }
        slide_down.setOnClickListener {
            //txtView.visibility= View.VISIBLE
            val animationslide_down = AnimationUtils.loadAnimation(this,R.anim.slide_out)
           // txtView.startAnimation(animationslide_down)
            imView.startAnimation(animationslide_down)
        }
        slide_up.setOnClickListener {
            //txtView.visibility= View.VISIBLE
            val animationslide_up = AnimationUtils.loadAnimation(this,R.anim.slide_in)
            //txtView.startAnimation(animationslide_up)
            imView.startAnimation(animationslide_up)
        }
        bounce.setOnClickListener {
            //txtView.visibility= View.VISIBLE
            val animationbounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
            //txtView.startAnimation(animationbounce)
            imView.startAnimation(animationbounce)
        }
        rotate.setOnClickListener {
           // txtView.visibility= View.VISIBLE
            val animationrotate= AnimationUtils.loadAnimation(this,R.anim.rotate)
            //txtView.startAnimation(animationrotate)
            imView.startAnimation(animationrotate)
        }
    }
}