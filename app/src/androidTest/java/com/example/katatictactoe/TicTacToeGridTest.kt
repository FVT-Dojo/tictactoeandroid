package com.example.katatictactoe

import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TicTacToeGridTest {

    @Test
    fun renderTicTacToeGrid() {
        // Step 3: Launch the Tic Tac Toe activity
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // Step 4: Check for the presence of the 3x3 grid
        onView(withId(R.id.ticTacToeGrid)).check(matches(isDisplayed()))

        // Step 5: Verify the grid properties
        onView(withId(R.id.ticTacToeGrid)).check { view, noViewFoundException ->
            if (view is RecyclerView) {
                val recyclerView = view as RecyclerView
                assertEquals(9, recyclerView.adapter?.itemCount)

                for (i in 0 until recyclerView.childCount) {
                    val cell = recyclerView.getChildAt(i)
                    assertTrue(cell.findViewById<TextView>(R.id.cellText).text.isEmpty())
                    assertTrue(cell.findViewById<View>(R.id.cellBorder).isVisible)
                }
            } else {
                throw noViewFoundException
            }
        }

        // Step 6: Verify the grid layout
        onView(withId(R.id.ticTacToeGrid)).check(matches(isCompletelyDisplayed()))
        onView(withId(R.id.ticTacToeGrid)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }
}