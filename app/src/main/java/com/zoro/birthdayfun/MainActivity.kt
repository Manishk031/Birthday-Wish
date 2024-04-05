package com.zoro.birthdayfun

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).text.toString()
       val intent = Intent(this,Birthdaywish::class.java)
        intent.putExtra(Birthdaywish.EXTRA_NAME,name)
        startActivity(intent)
    }
}