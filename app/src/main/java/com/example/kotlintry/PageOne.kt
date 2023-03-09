package com.example.kotlintry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlintry.databinding.ActivityPageOneBinding

class PageOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPageOneBinding = ActivityPageOneBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val message = intent.getStringExtra("extra")

        binding.txtWelcome.text= "welcome again $message"
    }
}