package com.example.android.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private var _count = 0
    val count: Int
        get() = _count


    private var currentWordCount = 0


    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord
}

