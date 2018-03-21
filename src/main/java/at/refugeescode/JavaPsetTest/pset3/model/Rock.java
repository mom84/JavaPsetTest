package at.refugeescode.JavaPsetTest.pset3.model;

public class Rock implements Move {


    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean wins(Move move) {
        return move.getClass() == Scissors.class || move.getClass() == Lizard.class;
    }
}
