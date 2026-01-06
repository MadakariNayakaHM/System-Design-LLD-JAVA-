package CaseStudies.DesignTicTacToe.Classic.Strategy;

import CaseStudies.DesignTicTacToe.Classic.Entity.Board;
import CaseStudies.DesignTicTacToe.Classic.Entity.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);

}
