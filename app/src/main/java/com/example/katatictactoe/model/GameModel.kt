package com.example.katatictactoe.model

enum class PlayerMark {
    X,
    O
}

class GameModel {
    var grid: List<List<PlayerMark?>> = listOf(
        listOf(null, null, null),
        listOf(null, null, null),
        listOf(null, null, null)
    )
}