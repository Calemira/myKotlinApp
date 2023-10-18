package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    }

    fun checkAnswer1(view: View) {
        val radioButtonDog: RadioButton = findViewById(R.id.radioButtonDog)
        val textViewResult1: TextView = findViewById(R.id.textViewResult1)

        if (radioButtonDog.isChecked) {
            textViewResult1.text = "Dobrze!"
        } else {
            textViewResult1.text = "Źle."
        }
    }

    fun checkAnswer2(view: View) {
        val radioButtonGotowanie: RadioButton = findViewById(R.id.radioButtonGotowanie)
        val textViewResult2: TextView = findViewById(R.id.textViewResult2)

        if (radioButtonGotowanie.isChecked) {
            textViewResult2.text = "Dobrze!"
        } else {
            textViewResult2.text = "Źle."
        }
    }
    fun checkAnswer3(view: View) {
        val radioButtonGram: RadioButton = findViewById(R.id.radioButtonGram)
        val textViewResult3: TextView = findViewById(R.id.textViewResult3)

        if (radioButtonGram.isChecked) {
            textViewResult3.text = "Dobrze!"
        } else {
            textViewResult3.text = "Źle."
        }
    }

    fun goBack(view: View) {
        onBackPressed()
    }

}