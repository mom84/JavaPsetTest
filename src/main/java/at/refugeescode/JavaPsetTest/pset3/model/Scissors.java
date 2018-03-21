package at.refugeescode.JavaPsetTest.pset3.model;

public class Scissors implements Move {


    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean wins(Move move) {

        return move.getClass() == Paper.class || move.getClass() == Lizard.class;
    }
}
