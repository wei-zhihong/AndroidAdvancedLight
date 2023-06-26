package com.example.advancedlight.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityCustomTestBinding

class CustomTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityCustomTestBinding.inflate(layoutInflater).also { binding = it }.root)
    }
}