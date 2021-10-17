package com.example.recyclerviewapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailJajanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jajan)

        val jajan = intent.getParcelableExtra<Jajan>(MainActivity.INTENT_PARCELABLE)

        val imgJajan = findViewById<ImageView>(R.id.cover_jajan)
        val namaJajan = findViewById<TextView>(R.id.judul_jajan)
        val descJajan = findViewById<TextView>(R.id.detail_jajan)

        imgJajan.setImageResource(jajan?.imgJajan!!)
        namaJajan.text = jajan.namaJajan
        descJajan.text = jajan.descJajan

    }
}