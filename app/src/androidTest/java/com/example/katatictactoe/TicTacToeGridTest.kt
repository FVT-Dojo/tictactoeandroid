import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.katatictactoe.model.GameModel
import org.junit.Rule
import org.junit.Test

class TicTacToeGridTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun ticTacToeGrid_showsTitleAndGrid() {
        // Arrange: Set the content to be tested
        composeTestRule.setContent {
            val state = GameModel()
            MaterialTheme {
                Surface {
                    TicTacToeGrid(gameState = state)
                }
            }
        }

        // Act & Assert: Verify that the title is displayed
        composeTestRule.onNodeWithTag("TicTacToeTitleText")
            .assertIsDisplayed()
            .assertTextEquals("Tic Tac Toe")

        // Act & Assert: Verify that each cell in the 3x3 grid is displayed
        repeat(3) {rowIndex ->
            repeat(3) {colIndex ->
                composeTestRule.onNodeWithTag("Cell_${rowIndex}_${colIndex}").assertIsDisplayed()
            }
        }
    }
}