package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare Views
        val txt : TextView = findViewById(R.id.txtView)
        val decreaseBtn : Button = findViewById(R.id.decreaseBtn)
        val increaseBtn : Button = findViewById(R.id.increaseBtn)

        //Increase function
        increaseBtn.setOnClickListener(){
            counter++
            txt.text = "" + counter
        }

        //Decrease function
        decreaseBtn.setOnClickListener(){
          if  (counter > 0)  counter--  else counter
            txt.text = "" + counter
        }
    }
}