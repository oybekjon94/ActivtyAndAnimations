package com.example.multipageactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multipageactivity.databinding.ActivityMainBinding
import com.example.multipageactivity.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNextBinding
    private val TAG = "activity_next"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: ")

        binding.doneBtn.setOnClickListener{
            val intent  =  Intent()
            val age = binding.ageEt.text.toString()
            intent.putExtra("age",age)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }


    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }
}