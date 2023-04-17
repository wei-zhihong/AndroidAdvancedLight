package com.example.advancedlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.advancedlight.databinding.ActivityMainBinding
import com.example.advancedlight.lollipop.LollipopActivity
import com.example.advancedlight.marshmallow.MarshmallowActivity
import com.example.advancedlight.nougat.NougatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.base_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.share -> Toast.makeText(this@MainActivity, "按了分享按钮", Toast.LENGTH_SHORT)
                .show()
            R.id.setting -> Toast.makeText(this@MainActivity, "按了设置按钮", Toast.LENGTH_SHORT)
                .show()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initViews() {
        val toolbar:Toolbar = findViewById<Toolbar?>(R.id.toolbar).apply {
            title = "hello"
        }
        setSupportActionBar(toolbar)
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