package com.example.androidchatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidchatapp.databinding.ActivityMainBinding
import com.example.androidwebsocketchatlibrary.ChatLauncher
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenChat.setOnClickListener {
            Log.d("MainActivity", "Open Chat button clicked!")
            ChatLauncher.start(this)
        }
    }
}
