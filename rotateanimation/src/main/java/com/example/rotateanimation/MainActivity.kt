package com.example.rotateanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.rotateanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alphaBtn.setOnClickListener{
            val animation1 = AnimationUtils.loadAnimation(this,R.anim.aplha_anim2)
            binding.imageView.startAnimation(animation1)
        }

        binding.rotateBtn.setOnClickListener{
            val animation1 = AnimationUtils.loadAnimation(this,R.anim.rotate_anim)
            binding.imageView.startAnimation(animation1)
        }
        binding.translateBtn.setOnClickListener{
            val animation1 = AnimationUtils.loadAnimation(this,R.anim.translate_anim)
            binding.imageView.startAnimation(animation1)
        }
        binding.scaleBtn.setOnClickListener{
            val animation1 = AnimationUtils.loadAnimation(this, R.anim.scale_anim)
            binding.imageView.startAnimation(animation1)
        }
        binding.combinationBtn.setOnClickListener{
            val animation1 = AnimationUtils.loadAnimation(this,R.anim.combination_anim)
            binding.imageView.startAnimation(animation1)
        }
    }
}