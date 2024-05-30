import android.app.GameState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.katatictactoe.model.GameModel

@Composable
fun TicTacToeGrid(gameState: GameModel) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .aspectRatio(1f)) {
        repeat(gameState.grid.size) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
            ) {
                repeat(gameState.grid.size) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                            .border(width = 1.dp, color = Color.Black)
                            .background(color = Color.White)
                    ) {

                    }
                }
            }
        }
    }
}


@Composable
@Preview
fun Preview_TicTacToeGrid() {
    val state = GameModel()
    TicTacToeGrid(gameState = state)
}