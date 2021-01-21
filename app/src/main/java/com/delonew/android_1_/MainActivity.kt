package com.delonew.android_1_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a: Button = findViewById(R.id.LogActionButton)
        a.setOnClickListener {
            Log.e("111", "My Button Clicked")
        }
        val t: TextView = findViewById(R.id.titleTextView)
        t.setText(R.string.app_name)
    }
}