package at.refugeescode.JavaPsetTest.pset1.controller;
import at.refugeescode.JavaPsetTest.pset1.model.Actor;
import at.refugeescode.JavaPsetTest.pset1.model.Movie;
import at.refugeescode.JavaPsetTest.pset1.model.Summary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class MovieDatabaseSummarizer {

    public Summary summarize(List<Movie> movies , List<Actor> actors) {

        // The 5 most rated films (top to bottom)
        List<String> topRatedMovie = movies.stream()
                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(5)
                .map(e -> e.getName() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////

        // The 2 most appearing movie genres (top to bottom)
        Map<String, Long> appearances = movies.stream()
                .filter(e -> e.getGenre().size() != 0)
                .map(movie -> movie.getGenre())
                .flatMap(movieList -> movieList.stream())
                .collect(Collectors.groupingBy(e -> e, counting()));

        List<String> topGenresMovies = appearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());


        ////////////////////////////////////////////////////////////////////////////////
        //The 5 most hired actors (top to bottom)
        Map<String, Long> actorsAppearances = actors.stream()
                .filter(e -> e.getActorsNames().size() != 0)
                .map(movie -> movie.getActorsNames())
                .flatMap(ActorList -> ActorList.stream())
                .collect(Collectors.groupingBy(e -> e, counting()));

        List<String> topHiredactors = actorsAppearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " " + e.getValue() + " times") //String
                .collect(Collectors.toList());




        ////////////////////////////////////////////////////////////////////////////////

        //The % of male-female ratio (biggest % smallest)
        long countOfFemale = actors.stream()
                .map(actor -> actor.getActorGender())
                .flatMap(List -> List.stream())
                .filter(e -> e.contains("2"))
                .count();
        long countOfMale = actors.stream()
                .map(actor -> actor.getActorGender())
                .flatMap(List -> List.stream())
                .filter(e -> e.contains("1"))
                .count();

        long Total = countOfFemale + countOfMale;

        Float PercentOfMale =(Float.parseFloat(String.valueOf(countOfMale))/Total*100);
         // System.out.println(PercentOfMale);

        Float PercentOfFemale =(Float.parseFloat(String.valueOf(countOfFemale))/Total*100);
         // System.out.println(PercentOfFemale);



//        List<Integer> collect = actors.stream()
//                .map(actor -> actor.getActorGender())
//                .flatMap(List -> List.stream())
//                .filter(e -> e.contains("2"))
//                .map(e -> Integer.parseInt(e))
//                .collect(Collectors.toList());
//        .reduce((e1, e2) -> e1 + e2);
//        System.out.println(reduce.get());


//        Map<String, Long> percentOfFemale = actors.stream()
//                .map(actor -> actor.getActorGender())
//                .flatMap(genderMale -> genderMale.stream())
//                .filter(num ->num.contains("2"))
//                .collect(Collectors.groupingBy(e -> e, counting()));
//
//
//
//        Map<String, Long> percentOfMale = actors.stream()
//                .map(actor -> actor.getActorGender())
//                .flatMap(genderFemale -> genderFemale.stream())
//                .filter(num ->num.contains("1"))
//                .collect(Collectors.groupingBy(e -> e, counting()));
//
//
//       Integer CountOfMale =  percentOfMale.entrySet().stream()
//                .mapToInt(e -> Math.toIntExact(e.getValue()))
//                .sum();
//        System.out.println(CountOfMale);

//        Optional<Long> reduce = percentOfMale.entrySet().stream()
//                .map(i -> Long.parseLong(String.valueOf(i.getValue())))
//                .reduce((e1, e2) -> e1 + e2);
//        System.out.println(reduce.get());

//        Optional<Long> reduce = percentOfMale.entrySet().stream()
//                .map(i -> i.getValue()) //Long
//                .reduce((e1, e2) -> e1 + e2);
//        System.out.println(reduce.get());

//        Integer CountOfFemale =  percentOfFemale.entrySet().stream()
//                .mapToInt(e -> Math.toIntExact(e.getValue()))
//                .sum();
//
//       Integer totalMaleAndFemale = CountOfMale + CountOfFemale;
//
//
//        List<String> percentMale = percentOfMale.entrySet().stream()
//                .map(e -> "Male" + " " +"("+ (Float.parseFloat(String.valueOf(e.getValue()))/totalMaleAndFemale*100)+")%")
//                .collect(Collectors.toList());
//
//        List<String> percentFemale = percentOfFemale.entrySet().stream()
//                .map(e -> "Female" + " " + "(" + (Float.parseFloat(String.valueOf(e.getValue()))/totalMaleAndFemale*100) + ")%")
//                .collect(Collectors.toList());


        Summary summary = new Summary();
        summary.setTopRatedMovies(topRatedMovie);
        summary.setTopGenresMovies(topGenresMovies);
        summary.setTopHiredActors(topHiredactors);
        summary.setActorsFemaleRatio(PercentOfFemale);
        summary.setActorsMaleRatio(PercentOfMale);

        return summary;
    }

}
