package com.example.advancedlight.lollipop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.advancedlight.databinding.ActivityRecyclerViewTestBinding

class RecyclerViewTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityRecyclerViewTestBinding.inflate(layoutInflater).also { binding = it }.root)
        initView()
    }

    private fun initView() {
        val strings = ArrayList<String>()
        for (i in 0 until 20) {
            strings.add(i.toString())
        }
        binding.rvTest.layoutManager = LinearLayoutManager(this)
        binding.rvTest.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        binding.rvTest.adapter = RvTestAdapter(this, strings)
    }
}