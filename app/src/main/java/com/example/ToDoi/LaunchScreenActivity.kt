package com.example.ToDoi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LaunchScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_screen)

        // Find the start button by its ID
        val startButton: Button = findViewById(R.id.start_button)

        // Set an OnClickListener on the start button
        startButton.setOnClickListener {
            // Create an Intent to start the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
