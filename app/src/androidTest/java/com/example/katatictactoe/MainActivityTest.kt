package com.example.katatictactoe

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.core.app.ActivityScenario
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule val composeTestRule = createComposeRule()
    @Test
    fun testPlaceAMarkOnTheBoard() {
        // Given a player has opened the Tic Tac Toe app on his phone
        ActivityScenario.launch(MainActivity::class.java).use {
            composeTestRule.apply {
                onNodeWithTag("Cell_0_0_text").assertDoesNotExist()
                //When the player taps the top left cell
                onNodeWithTag("Cell_0_0").performClick()
                //Then an 'X' will become visible in the top left cell
                onNodeWithTag("Cell_0_0_text").assertTextEquals("X")
            }
        }
    }
}
