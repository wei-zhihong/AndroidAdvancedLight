package com.example.advancedlight.lollipop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.advancedlight.databinding.ActivityRecyclerViewTestBinding

class RecyclerViewTestTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityRecyclerViewTestBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        val strings = ArrayList<String>()
        for (i in 0 until 20) {
            strings.add(i.toString())
        }
        val heights = ArrayList<Int>()
        for (i in 0 until strings.size) {
            heights.add((100 + Math.random() * 300).toInt())
        }
        binding.rvTest.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        binding.rvTest.adapter = RvTestTwoAdapter(this, strings, heights)
    }
}