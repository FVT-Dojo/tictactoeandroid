package com.example.katatictactoe

import com.example.katatictactoe.model.Player
import com.example.katatictactoe.model.createInitialState
import org.junit.Test
import org.junit.Assert.*

class GameStateTest {

    @Test
    fun `createInitialState should initialize game state with an empty board and Player X should be marked as the starting player`() {
        // Arrange
        val expectedBoard = List(9) { null }
        val expectedPlayer = Player.X

        // Act
        val initialState = createInitialState()

        // Assert
        assertEquals(expectedBoard, initialState.board)
        assertEquals(expectedPlayer, initialState.currentPlayer)
        initialState.board.forEach { assertNull(it) }
    }
}