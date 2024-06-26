package com.example.mypokemons

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("Second Activity", "Hi onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Second Activity", "Hi onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Second Activity", "Hi onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Second Activity", "Hi onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Second Activity", "Hi onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Second Activity", "Hi onDestroy")
    }
}