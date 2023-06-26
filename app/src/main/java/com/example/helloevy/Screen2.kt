package com.example.helloevy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val buttonClick = findViewById<Button>(R.id.button1)
        buttonClick.setOnClickListener{
            Toast.makeText(applicationContext, "Hi Evy", Toast.LENGTH_SHORT).show()
        }
    }
}