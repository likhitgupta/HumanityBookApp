package com.example.humanitybook

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val chapters = listOf("Unity", "Compassion", "Hope", "Struggle", "Peace")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.chapter_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, chapters)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, ChapterActivity::class.java)
            intent.putExtra("chapter", chapters[position])
            startActivity(intent)
        }
    }
}
