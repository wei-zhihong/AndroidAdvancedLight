package com.example.advancedlight.marshmallow

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.advancedlight.databinding.ActivityPermissionTestBinding

const val PERMISSION_CELL_PHONE = 1

class PermissionTestActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPermissionTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityPermissionTestBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
        binding.btnCellPhone.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), PERMISSION_CELL_PHONE)
            } else {
                cellPhone()
            }
        }
    }

    private fun cellPhone() {
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("tel:10086")
        try {
            startActivity(intent)
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == PERMISSION_CELL_PHONE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) cellPhone() else
                Toast.makeText(this, "权限被拒绝，请到设置中重新打开", Toast.LENGTH_SHORT).show()
            return
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}