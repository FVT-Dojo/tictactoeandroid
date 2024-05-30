import android.app.GameState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.katatictactoe.model.GameModel

@Composable
// Add a title that is like Word Art from the 90's
fun TicTacToeGrid(gameState: GameModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Box(
            modifier = Modifier.padding(16.dp)
        ) {
            androidx.compose.material3.Text(
                text = "Tic Tac Toe",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    shadow = Shadow(
                        color = Color.Gray,
                        offset = Offset(4f, 4f),
                        blurRadius = 8f
                    ),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif
                )
            )
        }
        for (i in 0 until 3) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                for (j in 0 until 3) {
                    Box(
                        modifier = Modifier
                            .width(80.dp)
                            .aspectRatio(1f)
                            .shadow(4.dp, RoundedCornerShape(8.dp)) // Add shadow and rounded corners
                            .border(2.dp, Color.Gray, RoundedCornerShape(8.dp)) // Use gray border with rounded corners
                            .background(Color.LightGray, RoundedCornerShape(8.dp)), // Light gray background with rounded corners
                        contentAlignment = Alignment.Center
                    ) {
                        // Placeholder for cell content, like X or O
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
    MaterialTheme {
        Surface {
            TicTacToeGrid(gameState = state)
        }
    }
}