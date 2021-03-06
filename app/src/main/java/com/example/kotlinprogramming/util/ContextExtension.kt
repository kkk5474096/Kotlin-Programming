package com.example.kotlinprogramming.presentation

import android.content.Context
import kotlin.math.roundToInt

fun Context.dpToPixel(dp: Int): Int =
    (dp * resources.displayMetrics.density).roundToInt()