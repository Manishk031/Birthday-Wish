package com.zoro.birthdayfun

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Birthdaywish : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "EXTRA_NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_birthdaywish)

        val name = intent.getStringExtra(EXTRA_NAME)
        val message = "Happy Birthday \n$name"
        findViewById<TextView>(R.id.BirthdayWisheer).text = message
    }
}