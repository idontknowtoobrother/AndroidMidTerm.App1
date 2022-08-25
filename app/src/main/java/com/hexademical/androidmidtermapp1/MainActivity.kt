package com.hexademical.androidmidtermapp1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton: Button = findViewById(R.id.hello_button)
        helloButton.setOnClickListener {
            val fullName:TextView = findViewById(R.id.full_name)
            val studentID:TextView = findViewById(R.id.student_id)
            Log.d(TAG, "Full Name: ${fullName.text} | Stuident ID: ${studentID.text}" )
        }
    }
}