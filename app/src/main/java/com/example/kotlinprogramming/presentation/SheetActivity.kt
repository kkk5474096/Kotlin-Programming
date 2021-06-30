package com.example.kotlinprogramming.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinprogramming.databinding.ActivitySheetBinding

class SheetActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySheetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSheet.setOnClickListener {
            val sheetFragment: SheetFragment = SheetFragment()

            sheetFragment.show(supportFragmentManager, sheetFragment.tag)
        }
    }
}