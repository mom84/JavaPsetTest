package at.refugeescode.JavaPsetTest.pset3.controller;

public class PlayerHotel {

    public Player getOnePlayer() {
        return new HumanPlayer();
    }

    public Player getOneComputer() {
        return new ComputerPlayer();
    }
}
