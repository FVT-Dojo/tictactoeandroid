import android.app.GameState
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.katatictactoe.model.GameModel

@Composable
fun TicTacToeGrid(gameState: GameModel) {
    Row {
        
    }
} 
@Composable
@Preview
fun Preview_TicTacToeGrid() {
    val state = GameModel()
    TicTacToeGrid(gameState = state)
}