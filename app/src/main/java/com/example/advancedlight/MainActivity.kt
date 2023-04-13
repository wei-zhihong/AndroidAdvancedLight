package com.example.advancedlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityMainBinding
import com.example.advancedlight.lollipop.LollipopActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)
        initView()
    }

    private fun initView() {
        binding.btnLollipop.setOnClickListener{
            startActivity(Intent(this, LollipopActivity::class.java))
        }
    }
}