package com.example.advancedlight.m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityMBinding

class MActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnPermissionTest.setOnClickListener {
            startActivity(Intent(this, PermissionTestActivity::class.java))
        }
    }
}