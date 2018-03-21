package at.refugeescode.JavaPsetTest.pset1.view;

import at.refugeescode.JavaPsetTest.pset1.model.Summary;

public class SummaryDisplayer {


    public void display(Summary summary) {

        // The 5 most rated films (top to bottom):
        System.out.println("The 5 most rated films (top to bottom):");
        summary.getTopRatedMovies()
                .forEach(movie -> System.out.println(movie));

        System.out.println("-----------------");

         //The 2 most appearing movie genres (top to bottom):
         System.out.println("The 2 most appearing movie genres (top to bottom): ");
         summary.getTopGenresMovies()
               .forEach(word -> System.out.println(word));

        System.out.println("-----------------");



        // The 5 most hired actors (top to bottom)
        System.out.println("The 5 most hired actors (top to bottom)");
        summary.getTopHiredActors()
               .forEach(names -> System.out.println(names));

        System.out.println("-----------------");


       // The % of male-female ratio (biggest % smallest)
        System.out.println("The % of male-female ratio (biggest % smallest)");

        Float actorsMaleRatio = summary.getActorsMaleRatio();
        System.out.println("Male" + " "+ actorsMaleRatio + " " + "%");


        Float actorsFemaleRatio = summary.getActorsFemaleRatio();
        System.out.println("Female" + " "+actorsFemaleRatio + " " + "%");


    }
}
