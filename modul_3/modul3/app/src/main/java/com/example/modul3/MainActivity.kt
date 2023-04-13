package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1 = findViewById<Button>(R.id.button_1)
        val button_2 = findViewById<Button>(R.id.button_2)

        button_1.setOnClickListener{
            Intent(this, MainActivity2::class.java).also{
                startActivity(it)
            }
        }

        button_2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)
        }
    }
}