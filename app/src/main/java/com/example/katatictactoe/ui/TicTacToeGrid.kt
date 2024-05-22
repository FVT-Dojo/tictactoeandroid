package com.example.katatictactoe.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//In this code:
//
//We create a Surface with a fixed size of 300dp and a black border.
//Inside the Surface, we use a Column to create three rows.
//Each row is a Row composable that contains three Box composables representing the cells.
//The cells have a weight of 1 to evenly distribute the available space and an aspect ratio of 1 to maintain a square shape.
//Each cell has a black border to visually separate them.

@Composable
fun TicTacToeGrid() {
    Surface(
        modifier = Modifier.size(300.dp).testTag("TicTacToeGrid"),
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