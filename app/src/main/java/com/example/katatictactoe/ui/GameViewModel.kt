package com.example.katatictactoe.ui

import androidx.lifecycle.ViewModel
import com.example.katatictactoe.model.GameModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

// These are parentheses, Mathijs: ()
// And these are brackets: []
// Obvious: {} are curly braces
class GameViewModel: ViewModel() {
    private val _GameState = MutableStateFlow(GameModel())
    val GameState = _GameState.asStateFlow()
}