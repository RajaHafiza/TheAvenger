package com.example.theavengers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var avengerAdapter: AvengerAdapter

    private val avengers = listOf(
        Avenger(
            "Iron Man",
            R.drawable.ironman,
            "Genius billionaire Tony Stark.",
            "Tony Stark is a genius billionaire who uses his technical knowledge and creativity to create a high-tech suit and become Iron Man, one of Earth's mightiest heroes."
        ),
        Avenger(
            "Captain America",
            R.drawable.captainamerica,
            "Super soldier Steve Rogers.",
            "Steve Rogers is a super soldier who was frozen in time and later became Captain America, leading the Avengers and serving as a symbol of freedom and justice."
        ),
        Avenger(
            "Thor",
            R.drawable.thor,
            "God of Thunder.",
            "Thor is the God of Thunder, hailing from Asgard. Armed with his magical hammer Mjolnir, he protects the Earth alongside his fellow Avengers."
        ),
        Avenger(
            "Hulk",
            R.drawable.hulk,
            "Bruce Banner, the incredible Hulk.",
            "Bruce Banner is a brilliant scientist who transforms into the Hulk when angered. The Hulk possesses incredible strength and resilience, making him a formidable ally in battles."
        ),
        Avenger(
            "Black Widow",
            R.drawable.blackwidow,
            "Natasha Romanoff, a master spy.",
            "Natasha Romanoff, known as Black Widow, is a former KGB agent and skilled spy. Trained in hand-to-hand combat and espionage, she uses her abilities to gather intelligence and fight alongside the Avengers."
        ),
        Avenger(
            "Hawkeye",
            R.drawable.hawkeye,
            "Expert marksman Clint Barton.",
            "Clint Barton, also known as Hawkeye, is an expert archer and marksman. His exceptional accuracy and agility make him a vital member of the Avengers, often providing cover fire in critical missions."
        ),
        Avenger(
            "Spider-Man",
            R.drawable.peter,
            "High school student Peter Parker.",
            "Peter Parker is a high school student who gains spider-like abilities after being bitten by a radioactive spider. As Spider-Man, he uses his agility and web-slinging skills to protect New York City from various threats."
        ),
        Avenger(
            "Black Panther",
            R.drawable.blackpanther,
            "King T'Challa of Wakanda. Rest in Peace My King.",
            "T'Challa, the Black Panther, is the king of Wakanda, a technologically advanced nation. He wears a suit made of vibranium and possesses enhanced abilities, fighting for justice both in his homeland and worldwide."
        ),
        Avenger(
            "Doctor Strange",
            R.drawable.drstrange,
            "Master of the mystic arts.",
            "Doctor Stephen Strange is a former neurosurgeon who becomes the Sorcerer Supreme. He protects Earth from mystical threats using his knowledge of the mystic arts and powerful artifacts."
        ),
        Avenger(
            "Ant-Man",
            R.drawable.antman,
            "Scott Lang, a shrinking hero.",
            "Scott Lang, also known as Ant-Man, is a former thief who discovers a suit that allows him to shrink in size while gaining the strength of an ant. He uses his abilities to help the Avengers and protect the world from evil."
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        avengerAdapter = AvengerAdapter(avengers) { avenger -> showDetails(avenger) }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = avengerAdapter
    }

    private fun showDetails(avenger: Avenger) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("avenger_name", avenger.name)
            putExtra("avenger_image", avenger.image)
            putExtra("avenger_description", avenger.fullDescription)  // Send long description
        }
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
