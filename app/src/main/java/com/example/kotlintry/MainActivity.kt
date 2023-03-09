package com.example.kotlintry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlintry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtHello.text="Hello Chisthia"

        binding.btnBye.setOnClickListener {
            Toast.makeText(this, "bye clicked", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,PageOne::class.java)
            intent.putExtra("extra","Chisthia")
            startActivity(intent)
        }

    }
}