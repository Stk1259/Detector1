package com.example.detector

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText: TextView = findViewById<TextView>(R.id.resultTextView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            resultText.text = "Вы точно гей!"
        }
    }
}


