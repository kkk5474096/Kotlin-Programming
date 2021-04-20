package com.example.kotlinprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        //new -> old (new + old)
        var new = "0"
        var old = "0"

        one.setOnClickListener {
            new += "1"
            result.text = new
        }
        two.setOnClickListener {
            new += "2"
            result.text = new
        }
        three.setOnClickListener {
            new += "3"
            result.text = new
        }
        four.setOnClickListener {
            new += "4"
            result.text = new
        }
        five.setOnClickListener {
            new += "5"
            result.text = new
        }
        six.setOnClickListener {
            new += "6"
            result.text = new
        }
        seven.setOnClickListener {
            new += "7"
            result.text = new
        }
        eight.setOnClickListener {
            new += "8"
            result.text = new
        }
        nine.setOnClickListener {
            new += "9"
            result.text = new
        }
        zero.setOnClickListener {
            new += "0"
            result.text = new
        }

        clear.setOnClickListener {
            old = "0"
            new = "0"
            result.text = ("0")
        }
        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.text = old
        }
    }
}