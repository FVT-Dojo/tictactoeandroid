package com.example.katatictactoe

import TicTacToeGrid
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.katatictactoe.model.GameModel
import com.example.katatictactoe.ui.theme.KataTicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KataTicTacToeTheme {
                TicTacToeGrid(gameState = GameModel())
            }
        }
    }
}