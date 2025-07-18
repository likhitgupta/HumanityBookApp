package com.example.humanitybook

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChapterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter)

        val chapter = intent.getStringExtra("chapter") ?: "Unknown"
        val textView: TextView = findViewById(R.id.chapter_text)

        val content = when (chapter) {
            "Unity" -> "Unity is the strength of humanity..."
            "Compassion" -> "Compassion is the heart of mankind..."
            "Hope" -> "Hope gives us reason to move forward..."
            "Struggle" -> "Struggle shapes our strength and wisdom..."
            "Peace" -> "Peace is the dream of all people..."
            else -> "Chapter not found."
        }

        title = chapter
        textView.text = content
    }
}
