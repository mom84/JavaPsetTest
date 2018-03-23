package at.refugeescode.JavaPsetTest.starterSpringServer;
import at.refugeescode.JavaPsetTest.pset1.controller.MovieDatabaseSummarizer;
import at.refugeescode.JavaPsetTest.pset1.model.Actor;
import at.refugeescode.JavaPsetTest.pset1.model.Movie;
import at.refugeescode.JavaPsetTest.pset1.model.Summary;
import at.refugeescode.JavaPsetTest.pset1.parser.ActorParser;
import at.refugeescode.JavaPsetTest.pset1.parser.MovieParser;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class starterSpringServer {


    @Bean
    ApplicationRunner applicationRunner(MovieDatabaseSummarizer movieDatabaseSummarizer, MovieParser movieParser, ActorParser actorParser){
        return args -> {
            List<Actor> actors = actorParser.getActors();
            List<Movie> movies = movieParser.getMovies();
            Summary summarize = movieDatabaseSummarizer.summarize(movies, actors);

            List<String> topRatedMovies = summarize.getTopRatedMovies();
            topRatedMovies.forEach(e -> System.out.println(e));
            System.out.println("----------------------------");

            List<String> topGenresMovies = summarize.getTopGenresMovies();
            topGenresMovies.forEach(e -> System.out.println(e));
            System.out.println("----------------------------");

            List<String> topHiredActors = summarize.getTopHiredActors();
            topHiredActors.forEach(e -> System.out.println(e));
            System.out.println("----------------------------");

            Float actorsFemaleRatio = summarize.getActorsFemaleRatio();
            System.out.println(actorsFemaleRatio);
            Float actorsMaleRatio = summarize.getActorsMaleRatio();
            System.out.println(actorsMaleRatio);
            System.out.println("----------------------------");

        };
    }

}
