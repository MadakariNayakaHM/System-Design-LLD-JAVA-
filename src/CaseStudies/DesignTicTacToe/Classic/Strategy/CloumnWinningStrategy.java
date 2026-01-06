package CaseStudies.DesignTicTacToe.Classic.Strategy;

import CaseStudies.DesignTicTacToe.Classic.Entity.Board;
import CaseStudies.DesignTicTacToe.Classic.Entity.Player;

public class CloumnWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Player player) {

        for(int col =0; col<board.getSize(); col++)
        {
            boolean colWin = true;

            for(int row = 0; row< board.getSize(); row++)
            {
                if(board.getCell(row, col).getSymbol() != player.getSymbol())
                {
                    colWin = false;
                    break;
                }
            }
            if(colWin) return true;
        }
        return false;
    }
}
