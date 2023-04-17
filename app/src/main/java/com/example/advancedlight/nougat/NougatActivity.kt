package com.example.advancedlight.nougat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityNougatBinding

class NougatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNougatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityNougatBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnWindowsTest.setOnClickListener {
            startActivity(Intent(this, WindowsActivity::class.java))
        }
    }
}