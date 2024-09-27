package com.example.theavengers

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("avenger_name")
        val image = intent.getIntExtra("avenger_image", 0)
        val description = intent.getStringExtra("avenger_description")

        findViewById<TextView>(R.id.avenger_name).text = name
        findViewById<ImageView>(R.id.avenger_image).setImageResource(image)
        findViewById<TextView>(R.id.avenger_description).text = description // Tampilkan deskripsi panjang
    }
}
