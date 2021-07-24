package com.example.kotlinprogramming.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {

    var score = finalScore

    init {
        Log.d("ScoreViewModel", "Final score is $finalScore")
    }

}