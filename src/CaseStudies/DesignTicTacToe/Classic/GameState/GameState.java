package CaseStudies.DesignTicTacToe.Classic.GameState;

import CaseStudies.DesignTicTacToe.Classic.Entity.Game;
import CaseStudies.DesignTicTacToe.Classic.Entity.Player;

public interface GameState {
    void handleMove(Game game, Player player, int row, int col);
}
