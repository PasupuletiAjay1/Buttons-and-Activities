package com.example.buttons

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : BaseActivity() {
    override val str = "Activity-C"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        print("onCreate")

        val buttonClickMain = findViewById<Button>(R.id.buttonMain)
        buttonClickMain.setOnClickListener {
            //println("Back to Main Activity")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}