package at.refugeescode.JavaPsetTest.pset2.view;
import at.refugeescode.JavaPsetTest.pset2.model.Movement;

public class Jury {

    public String sayResult(Movement player1Move, Movement player2Move) {


        if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            return "Player1 Win\nplayer1 Move Rock---ComputerPlayer Move Scissors";

        }
        else if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Paper")) {
            return "ComputerPlayer Win\nplayer1 Move Rock---ComputerPlayer Move paper";

        }

        else if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
                    return"No Body Win\nplayer1 Move Rock---ComputerPlayer Move Rock";

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            return "ComputerPlayer Win\nplayer1 Move paper----ComputerPlayer Move Scissors";

        }

        else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
            return "Player1 Win\nplayer1 Move Paper---ComputerPlayer Move Rock";

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Paper")) {
            return "No Body Win\nplayer1 Move Paper---ComputerPlayer Move Paper";

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Scissors") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            return "No Body Win\nplayer1 Move Scissors---ComputerPlayer Move Scissors";

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Scissors") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
            return "ComputerPlayer Win\nplayer1 Move Scissors----ComputerPlayer Move Rock";

        }

        else  {
            return "Player1 Win\nplayer1 Move Scissors----ComputerPlayer Move Paper";

        }


    }




}

