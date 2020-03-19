package fr.bdmz.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>(finalScore)
    val score: LiveData<Int>
        get() = _score

    private val _eventPlayAgain = MutableLiveData<Boolean>(false)
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    fun togglePlayAgain(playAgain: Boolean) {
        _eventPlayAgain.value = playAgain
    }
}