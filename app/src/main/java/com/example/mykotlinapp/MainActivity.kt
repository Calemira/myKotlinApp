package com.example.mykotlinapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learnMoreButton: Button = findViewById(R.id.learnMoreButton)
        learnMoreButton.setOnClickListener {
            val intent = Intent(this, AboutMeActivity::class.java)
            startActivity(intent)
        }
    }
}
