package com.example.startandroidpainting145

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.PolyToPoly
import kotlinx.android.synthetic.main.activity_main.PolyToPoly2
import kotlinx.android.synthetic.main.activity_main.PolyToPoly3
import kotlinx.android.synthetic.main.activity_main.PolyToPoly4
import kotlinx.android.synthetic.main.activity_main.RectToRect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RectToRect.setOnClickListener {
            startActivity(Intent(this, RectToRectActivity::class.java))
        }
        PolyToPoly.setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity::class.java))
        }
        PolyToPoly2.setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity2Dots::class.java))
        }
        PolyToPoly3.setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity3Dots::class.java))
        }
        PolyToPoly4.setOnClickListener {
            startActivity(Intent(this, PolyToPolyActivity4Dots::class.java))
        }
    }
}