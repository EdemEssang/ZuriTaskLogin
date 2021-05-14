package com.example.zuritasklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zuritasklogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var  binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    overide fun onDestroy(){
        super.onDestroy()
        binding = null
    }
}