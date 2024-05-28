package com.example.katatictactoe.model

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class GameModelTest {

    @Before
    fun setUp() {
    }

    @Test
    fun `Create empty game board, which is a 3x3 grid`() {
        val gameModel = GameModel()

        val rows = gameModel.grid
        assertEquals(3, rows.size)

        rows.forEach { row ->
            assertEquals(3, row.size)

            row.forEach { cell ->
                assertNull(cell)
            }
        }
    }

    @After
    fun tearDown() {
    }
}