package com.example.advancedlight.lollipop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityLollipopBinding

class LollipopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLollipopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityLollipopBinding.inflate(layoutInflater).also { binding = it }.root)
        initView()
    }

    private fun initView() {
        binding.btnRvTest.setOnClickListener{
            startActivity(Intent(this, RecyclerViewTestActivity::class.java))
        }
        binding.btnRvTestTwo.setOnClickListener{
            startActivity(Intent(this, RecyclerViewTestTwoActivity::class.java))
        }
    }
}