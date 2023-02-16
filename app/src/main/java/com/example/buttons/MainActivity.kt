package com.example.buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import android.view.View
import android.widget.Button

class MainActivity : BaseActivity() {
    override val str = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("onCreate")

        //Activity-A button
        val buttonClickA = findViewById<Button>(R.id.button)
        buttonClickA.setOnClickListener {
            //println("Activity-A is selected!")
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        //Activity-B button
        val buttonClickB = findViewById<Button>(R.id.button2)
        buttonClickB.setOnClickListener {
            //println("Activity-B is selected!")
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        //Activity-C button
        val buttonClickC = findViewById<Button>(R.id.button3)
        buttonClickC.setOnClickListener {
            //println("Activity-C is selected!")
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
    }


}