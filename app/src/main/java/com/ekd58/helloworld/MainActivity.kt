package com.ekd58.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastButton: Button = findViewById(R.id.button)
        toastButton.setOnClickListener {
            Toast.makeText(this, "Test Message!!!!!", Toast.LENGTH_SHORT).show()
        }
    }
}
