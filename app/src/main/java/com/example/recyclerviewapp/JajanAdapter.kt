package com.example.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JajanAdapter(private val context: Context, private val jajan: List<Jajan>, val listener: (Jajan) -> Unit)
    : RecyclerView.Adapter<JajanAdapter.JajanViewHolder>() {

    class JajanViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgJajan = view.findViewById<ImageView>(R.id.Jajan_img)
        val namaJajan = view.findViewById<TextView>(R.id.nama_jajan)
        val descJajan = view.findViewById<TextView>(R.id.desk_jajan)

        fun bindView(jajan: Jajan, listener: (Jajan) -> Unit){
            imgJajan.setImageResource(jajan.imgJajan)
            namaJajan.text = jajan.namaJajan
            descJajan.text = jajan.descJajan
            itemView.setOnClickListener{
                listener(jajan)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JajanViewHolder {
        return JajanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_jajan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: JajanViewHolder, position: Int) {
        holder.bindView(jajan[position], listener )
    }

    override fun getItemCount(): Int = jajan.size

}