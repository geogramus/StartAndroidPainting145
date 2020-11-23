package com.example.startandroidpainting145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RectToRectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawRectToRect(this))
    }
}