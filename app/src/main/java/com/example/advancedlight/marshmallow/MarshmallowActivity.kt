package com.example.advancedlight.marshmallow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedlight.databinding.ActivityMarshmallowBinding

class MarshmallowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMarshmallowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMarshmallowBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnPermissionTest.setOnClickListener {
            startActivity(Intent(this, PermissionTestActivity::class.java))
        }
    }
}