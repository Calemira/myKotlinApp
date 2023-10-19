package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TravelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
    }
    fun goBack(view: View) {
        onBackPressed()
    }
}