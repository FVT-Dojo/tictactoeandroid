# User stories

MVP:
- No storage/database

Backlog:
- Add persistance, like a leaderboard

## As a player, I want to see a 3x3 grid so that I can play tic tac toe.
✅ Set-up an empty ViewModel
Create model for the game board (3x3 grid, 2d-array?)
- ✅ Create GameBoard instance --> empty 3x3 grid
- ✅ Add GameModel to ViewModel
- ✅ Create View for the TicTacToe grid (Where is the test????????)
- - ✅ Create a test for the grid, to make sure it shows

## As a player, I want to be able to place my symbol (X or O) on an empty cell in the grid so that I can make my move.
Assuming that X always starts the game.

Given a player has opened the Tic Tac Toe app on his phone
When the player taps the top left cell
Then an 'X' will become visible in the top left cell

### Create an Espresso test for this scenario
Configure the Espresso dependencies --> not needed, for now
Create the test

## As a player, I want to take turns with my opponent so that we can play a fair game.

## As a player, I want the game to recognize when I have won so that I can celebrate my victory.

## As a player, I want the game to recognize when there is a draw so that I know when the game is over.

## As a player, I want to be able to start a new game so that I can play again.