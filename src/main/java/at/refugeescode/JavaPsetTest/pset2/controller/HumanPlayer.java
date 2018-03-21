package at.refugeescode.JavaPsetTest.pset2.controller;
import at.refugeescode.JavaPsetTest.pset2.model.Movement;
import at.refugeescode.JavaPsetTest.pset2.model.Paper;
import at.refugeescode.JavaPsetTest.pset2.model.Rock;
import at.refugeescode.JavaPsetTest.pset2.model.Scissors;
import java.util.Scanner;


public class HumanPlayer implements Player {

    Scanner scan;

    public HumanPlayer() {

        super();
        scan = new Scanner(System.in);
    }


    public Movement getMove() {

        System.out.println("Write your move (rock, scissors, paper): ");
        String playerMove = scan.nextLine().toLowerCase();
        Movement move1 = new Paper();
        Movement move2 = new Scissors();
        Movement move3 = new Rock();


        if(playerMove.equals("rock")){
            return move3;
        }
        else if (playerMove.equals("scissors"))
            return move2;
        else if (playerMove.equals("paper"))
            return move1;
        else{
            System.out.println("Invalid input");
            return getMove();
        }


    }
}
