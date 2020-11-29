package com.example.android_crud_boilerplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btIncrementer = findViewById(R.id.buttonIncrement) as Button
        val btDecrementer = findViewById(R.id.buttonDecrement) as Button
        var num = 0;
        val textview = findViewById(R.id.textViewName) as TextView

        btIncrementer.setOnClickListener({
            if (num < 10) {
                num += 1;
            }
            textview.setText("${num}");
        })

        btDecrementer.setOnClickListener({
            if (num > 0) {
                num -= 1;
            }
            textview.setText("${num}");
        })

    }
}