package CaseStudies.DesignTicTacToe.Classic.Observer;

import CaseStudies.DesignTicTacToe.Classic.Entity.Game;

public interface GameObserver {
    void update(Game game);
}