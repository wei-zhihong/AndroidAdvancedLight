package com.example.advancedlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.advancedlight.customview.ObjectAnimatorTestActivity
import com.example.advancedlight.databinding.ActivityCustomViewBinding

class CustomViewActivity : AppCompatActivity() {
    private var view: View? = null
    private lateinit var binding: ActivityCustomViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityCustomViewBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnMoveRect.setOnClickListener {
            startActivity(Intent(this, ObjectAnimatorTestActivity::class.java))
        }
    }
}