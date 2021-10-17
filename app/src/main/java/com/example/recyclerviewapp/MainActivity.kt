package com.example.recyclerviewapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jajanList = listOf<Jajan>(
            Jajan(
                R.drawable.jajan1,
                "Jajan1",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.jajan1,
                "Jajan2",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.jajan1,
                "Jajan3",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.ic_launcher_foreground,
                "Jajan4",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.ic_launcher_foreground,
                "Jajan5",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.ic_launcher_foreground,
                "Jajan6",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.ic_launcher_foreground,
                "Jajan7",
                "lorem ipsum dolor sit amet"
            ),
            Jajan(
                R.drawable.ic_launcher_foreground,
                "Jajan8",
                "lorem ipsum dolor sit amet"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.viewer_jajan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = JajanAdapter(this, jajanList){
            val intent = Intent(this, DetailJajanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}