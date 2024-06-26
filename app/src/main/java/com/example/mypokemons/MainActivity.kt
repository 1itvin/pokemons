package com.example.mypokemons

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

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