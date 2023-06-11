package com.example.userinfoapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userinfoapp.databinding.ActivityAddUserBinding
import com.example.userinfoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("db", MODE_PRIVATE)
        binding.nameTv.text = sharedPreferences.getString("name","")
        binding.surnameTv.text = sharedPreferences.getString("surname","")
        binding.ageTv.text = sharedPreferences.getString("age","")

        binding.clearBtn.setOnClickListener{
            sharedPreferences.edit().clear().apply()
            finish()
        }
    }
}