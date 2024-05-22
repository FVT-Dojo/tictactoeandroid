import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.unit.dp
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.katatictactoe.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TicTacToeGridTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun renderTicTacToeGrid() {
        // Check for the presence of the 3x3 grid
        composeTestRule.onNodeWithTag("TicTacToeGrid").assertIsDisplayed()

        // Verify the grid properties
        composeTestRule.onNodeWithTag("TicTacToeGrid").onChildren()
            .assertCountEquals(9)
            .onFirst().assertIsDisplayed() // Just checking the first cell as an example

        // Verify the grid layout
        composeTestRule.onNodeWithTag("TicTacToeGrid")
            .assertIsDisplayed()
            .assertWidthIsEqualTo(300.dp)
            .assertHeightIsEqualTo(300.dp)
    }
}
