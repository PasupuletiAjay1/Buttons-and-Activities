package com.example.buttons

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : BaseActivity() {
    override val str = "Activity-A"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        print("onCreate")

        val buttonClickMain = findViewById<Button>(R.id.buttonMain)
        buttonClickMain.setOnClickListener {
            //println("Back to Main Activity")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}