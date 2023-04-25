package com.example.advancedlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityVersionBinding
import com.example.advancedlight.lollipop.LollipopActivity
import com.example.advancedlight.marshmallow.MarshmallowActivity
import com.example.advancedlight.nougat.NougatActivity

class VersionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVersionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityVersionBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnLollipop.setOnClickListener{
            startActivity(Intent(this, LollipopActivity::class.java))
        }
        binding.btnM.setOnClickListener {
            startActivity(Intent(this, MarshmallowActivity::class.java))
        }
        binding.btnN.setOnClickListener {
            startActivity(Intent(this, NougatActivity::class.java))
        }
    }
}