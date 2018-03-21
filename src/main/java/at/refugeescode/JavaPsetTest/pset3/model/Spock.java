package at.refugeescode.JavaPsetTest.pset3.model;

public class Spock implements Move {
    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean wins(Move move) {
        return move.getClass() == Scissors.class || move.getClass() == Rock.class;
    }
}
