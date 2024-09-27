package com.example.theavengers

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Set the image and text for the profile
        findViewById<ImageView>(R.id.profileImage).setImageResource(R.drawable.fiz)
        findViewById<TextView>(R.id.nameTextView).text = "Raja Hafiza Ramanda Putra"
        findViewById<TextView>(R.id.emailTextView).text = "ramandaputra0104@gmail.com"
    }
}
