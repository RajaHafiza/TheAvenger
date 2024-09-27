package com.example.theavengers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AvengerAdapter(
    private val avengers: List<Avenger>,
    private val onItemClick: (Avenger) -> Unit
) : RecyclerView.Adapter<AvengerAdapter.AvengerViewHolder>() {

    inner class AvengerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val avengerImage: ImageView = itemView.findViewById(R.id.avenger_image)
        private val avengerName: TextView = itemView.findViewById(R.id.avenger_name)
        private val avengerDescription: TextView = itemView.findViewById(R.id.avenger_description)

        fun bind(avenger: Avenger) {
            avengerImage.setImageResource(avenger.image)
            avengerName.text = avenger.name
            avengerDescription.text = avenger.shortDescription // Gunakan deskripsi singkat

            itemView.setOnClickListener { onItemClick(avenger) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvengerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_avenger, parent, false)
        return AvengerViewHolder(view)
    }

    override fun onBindViewHolder(holder: AvengerViewHolder, position: Int) {
        holder.bind(avengers[position])
    }

    override fun getItemCount(): Int = avengers.size
}
