package com.example.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        sharedPreferences = getPreferences(MODE_PRIVATE)
        counter = sharedPreferences.getInt("count",0)
        setContentView(binding.root)
        binding.counterTv.text = counter.toString()
        binding.incrementBtn.setOnClickListener{
            counter++
            binding.counterTv.text = counter.toString()
        }

    }

    override fun onStop() {
        sharedPreferences.edit().putInt("count",counter).apply()
        super.onStop()
    }
}