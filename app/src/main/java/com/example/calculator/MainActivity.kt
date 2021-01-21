package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonPressed (v:View ) {
        val b = v as Button
        when(b.text) {
            "9" ->  {
                val number = resultsText.text.toString() + b.text
                resultsText.text = number
            }
        }
    }
}