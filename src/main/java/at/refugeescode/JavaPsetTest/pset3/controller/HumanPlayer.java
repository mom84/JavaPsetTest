package at.refugeescode.JavaPsetTest.pset3.controller;

import at.refugeescode.JavaPsetTest.pset3.model.Move;
import java.util.Scanner;
import java.util.stream.Collectors;


public class HumanPlayer implements Player {


    @Override
    public Move chooseOneMove(Moves moves) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one Move among the following: ");
        show(moves);
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        return toMove(choice, moves);
    }

    private void show(Moves moves) {
        String ShowAvailableMoves = moves.getMoves().stream()
                .map(move -> move.getName())
                .collect(Collectors.joining(", "));
        System.out.println(ShowAvailableMoves);
    }

    private Move toMove(String choice, Moves moves) {
        return moves.getMoves().stream()
                .filter(move -> move.getName().equalsIgnoreCase(choice))
                .findFirst().get();
    }
}
