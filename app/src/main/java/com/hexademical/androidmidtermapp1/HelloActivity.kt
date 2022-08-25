package com.hexademical.androidmidtermapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val displayName: TextView = findViewById(R.id.display_full_name)
        val full_name: String = intent.getStringExtra("full_name").toString()
        displayName.text = full_name

    }
}