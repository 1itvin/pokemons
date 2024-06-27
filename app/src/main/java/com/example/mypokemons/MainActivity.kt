package com.example.mypokemons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.example.mypokemons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("Main Activity", "Hi onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "Hi onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "Hi onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "Hi onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "Hi onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "Hi onDestroy")
    }
}