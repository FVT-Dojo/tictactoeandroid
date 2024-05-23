package com.example.katatictactoe.model

enum class CellValue {
    X, O
}

enum class Player {
    X, O
}

data class GameState(
    val board: List<CellValue?>,
    val currentPlayer: Player
)

// Add a function that creates an empty board (2d-array)

// Add a function to modify the board

fun createInitialState(): GameState {
    val board = List(9) { null }
    return GameState(board, Player.X)
}