package com.example.startandroidpainting145

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.RectToRect).setOnClickListener {
            startActivity(Intent(this, RectToRectActivity::class.java))
        }
        findViewById<View>(R.id.PolyToPoly).setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity::class.java))
        }
        findViewById<View>(R.id.PolyToPoly2).setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity2Dots::class.java))
        }
        findViewById<View>(R.id.PolyToPoly3).setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity3Dots::class.java))
        }
        findViewById<View>(R.id.PolyToPoly4).setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity4Dots::class.java))
        }
    }
}
