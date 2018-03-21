package at.refugeescode.JavaPsetTest.pset3.controller;

import at.refugeescode.JavaPsetTest.pset3.model.Move;

import java.util.Collections;
import java.util.List;


public class ComputerPlayer implements Player {

    @Override
    public Move chooseOneMove(Moves moves) {
        return chooseRandmlyMove(moves);
    }

    private Move chooseRandmlyMove(Moves moves) {
        List<Move> ListOfMoves = moves.getMoves();
        Collections.shuffle(ListOfMoves);
        return ListOfMoves.get(0);
    }

}
