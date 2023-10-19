package com.example.mykotlinapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton

class AboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)

        val earthButton = findViewById<ImageButton>(R.id.earthButton)
        earthButton.setOnClickListener {
            val intent = Intent(this, TravelActivity::class.java)
            startActivity(intent)
        }
    }

    fun startQuiz(view: View) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }

    fun returnToMain(view: View) {
        finish()
    }

    fun goBack(view: View) {
        onBackPressed()
    }

}