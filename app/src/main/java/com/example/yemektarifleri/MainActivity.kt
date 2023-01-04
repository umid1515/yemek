package com.example.yemektarifleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yemektarifleri.R.layout
import com.example.yemektarifleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate( savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}