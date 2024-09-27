package com.example.theavengers

data class Avenger(
    val name: String,
    val image: Int,
    val shortDescription: String,  // Deskripsi singkat untuk MainActivity
    val fullDescription: String    // Deskripsi panjang untuk DetailActivity
)

