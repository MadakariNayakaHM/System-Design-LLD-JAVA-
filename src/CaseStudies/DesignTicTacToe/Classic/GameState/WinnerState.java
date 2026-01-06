package CaseStudies.DesignTicTacToe.Classic.GameState;

import CaseStudies.DesignTicTacToe.Classic.Entity.Game;
import CaseStudies.DesignTicTacToe.Classic.Entity.Player;
import CaseStudies.DesignTicTacToe.Classic.InvalidMoveException;

class WinnerState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        throw new InvalidMoveException("Game is already over. " + game.getWinner().getName() + " has won.");
    }
}
