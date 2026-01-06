package CaseStudies.DesignTicTacToe.Classic.GameState;

import CaseStudies.DesignTicTacToe.Classic.Entity.Game;
import CaseStudies.DesignTicTacToe.Classic.Entity.Player;
import CaseStudies.DesignTicTacToe.Classic.Enum.GameStatus;
import CaseStudies.DesignTicTacToe.Classic.Enum.Symbol;
import CaseStudies.DesignTicTacToe.Classic.InvalidMoveException;

public class InProgressState  implements GameState{
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        if (game.getCurrentPlayer() != player) {
            throw new InvalidMoveException("Not your turn!");
        }

        // Place the piece on the board
        game.getBoard().placeSymbol(row, col, player.getSymbol());

        // Check for a winner or a draw
        if (game.checkWinner(player)) {
            game.setWinner(player);
            game.setStatus(player.getSymbol() == Symbol.X ? GameStatus.WINNER_X : GameStatus.WINNER_O);
            game.setState(new WinnerState());
        } else if (game.getBoard().isFull()) {
            game.setStatus(GameStatus.DRAW);
            game.setState(new DrawState());
        } else {
            // If the game is still in progress, switch players
            game.switchPlayer();
        }
    }
}
