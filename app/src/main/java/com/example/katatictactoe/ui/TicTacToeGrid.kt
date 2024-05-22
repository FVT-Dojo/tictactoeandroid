package com.example.katatictactoe.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TicTacToeGrid() {
    Surface(
        modifier = Modifier.size(300.dp),
        border = BorderStroke(2.dp, Color.Black)
    ) {
        Column(Modifier.fillMaxSize()) {
            repeat(3) { row ->
                Row(Modifier.weight(1f)) {
                    repeat(3) { column ->
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1f)
                                .border(BorderStroke(1.dp, Color.Black))
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TicTacToeGridPreview() {
    TicTacToeGrid()
}