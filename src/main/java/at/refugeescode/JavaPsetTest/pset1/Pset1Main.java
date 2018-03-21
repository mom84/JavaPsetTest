package at.refugeescode.JavaPsetTest.pset1;
import at.refugeescode.JavaPsetTest.pset1.controller.MovieDatabaseSummarizer;
import at.refugeescode.JavaPsetTest.pset1.model.Actor;
import at.refugeescode.JavaPsetTest.pset1.model.Movie;
import at.refugeescode.JavaPsetTest.pset1.model.Summary;
import at.refugeescode.JavaPsetTest.pset1.parser.ActorParser;
import at.refugeescode.JavaPsetTest.pset1.parser.MovieParser;
import at.refugeescode.JavaPsetTest.pset1.view.SummaryDisplayer;
import java.util.List;

public class Pset1Main {

    public static void main(String[] args) {

        MovieParser parserMovie = new MovieParser();
        List<Movie> movies = parserMovie.getMovies();

        ActorParser parserActor = new ActorParser();
        List<Actor> actors = parserActor.getActors();


        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        Summary summary = summarizer.summarize(movies , actors);

           displayer.display(summary);

        }

    }