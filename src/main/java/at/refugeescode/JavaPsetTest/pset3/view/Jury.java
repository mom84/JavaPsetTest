package at.refugeescode.JavaPsetTest.pset3.view;


import at.refugeescode.JavaPsetTest.pset3.model.Move;

public class Jury {

    public void sayResult(Move move1, Move move2) {

        if(move1.wins(move2)){
            System.out.println("\nPlayer1 Win"+ "\n" + "Player1 move"+ " " + move1.getName() + " " + " ,ComputerPlayer move"+ " " + move2.getName());
            System.out.println();
        }
        else if(move2.wins(move1)){
            System.out.println("\nComputerPlayer Win"+ "\n" + "Player1 move"+ " " + move1.getName() + " " + " ,ComputerPlayer move"+ " " + move2.getName());
            System.out.println();
        }
        else{
            System.out.println("\nNo Body Win, It is Tie"+ "\n" + "Player1 move"+ " " + move1.getName() + " " + " ,ComputerPlayer move"+ " " + move2.getName());
            System.out.println();
        }

    }



}

//  System.out.println("The player picked: " + move1.getName());
//          System.out.println("The computer picked: " + move2.getName());
//
//          if (move1.getName().equalsIgnoreCase(move2.getName())) {
//          System.out.println("No Body Win!");
//          } else if (move1.getName().equalsIgnoreCase("rock") && move2.getName().equalsIgnoreCase("scissors")){
//          System.out.println("The player Win!");
//          }
//          else if (move1.getName().equalsIgnoreCase("rock") && move2.getName().equalsIgnoreCase("paper")){
//          System.out.println("The computer Win!");
//          }
//
//          else if (move1.getName().equalsIgnoreCase("paper") && move2.getName().equalsIgnoreCase("rock")){
//          System.out.println("The player Win!");
//          }
//
//          else if (move1.getName().equalsIgnoreCase("paper") && move2.getName().equalsIgnoreCase("scissors")){
//          System.out.println("The computer Win!");
//          }
//
//          else if (move1.getName().equalsIgnoreCase("scissors") && move2.getName().equalsIgnoreCase("paper")){
//          System.out.println("The player Win!");
//          }
//
//          else if (move1.getName().equalsIgnoreCase("scissors") && move2.getName().equalsIgnoreCase("rock")){
//          System.out.println("The computer Win!");
//          }