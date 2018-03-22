package at.refugeescode.JavaPsetTest.pset2.controller.player;

import at.refugeescode.JavaPsetTest.pset2.model.move.Move;

public interface Player {

    Move getMove();

    boolean wantsToPlayAgain();

}
