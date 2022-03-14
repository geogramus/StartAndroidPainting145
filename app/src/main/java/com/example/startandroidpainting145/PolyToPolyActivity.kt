package com.example.startandroidpainting145

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PolyToPolyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawPolyToPoly(this))
    }
}
