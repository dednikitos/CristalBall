package com.example.cristalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.os.SystemClock
import android.view.animation.AnimationUtils
import com.example.cristalball.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bReto.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.animation_button)
            binding.bReto.startAnimation(animation)
            binding.bReto.text = getReto()

        }
    }

    private fun randomNumber() : Int {
        val sizeMass = resources.getStringArray(R.array.reto).size
        return (0 until sizeMass).random()
    }

    private fun getReto() : String {
        return resources.getStringArray(R.array.reto)[randomNumber()]
    }
}