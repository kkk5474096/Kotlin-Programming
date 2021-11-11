package com.example.kotlinprogramming.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRcv()
    }

    private fun setRcv() {
        val dataAdapter = DataAdapter()
        binding.rvMainList.layoutManager = LinearLayoutManager(this)
        binding.rvMainList.adapter = dataAdapter
        dataAdapter.setItems(listOf(
            ProfileInfo("https://avatars.githubusercontent.com/u/56147398?v=4","하하", 26),
            ProfileInfo("https://avatars.githubusercontent.com/u/56147398?v=4","호호", 23)
        ))
    }
}
