package at.refugeescode.JavaPsetTest.pset1.model;
import at.refugeescode.JavaPsetTest.pset1.controller.MovieDatabaseSummarizer;
import at.refugeescode.JavaPsetTest.pset1.parser.ActorParser;
import at.refugeescode.JavaPsetTest.pset1.parser.MovieParser;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest

class SummaryTest {

    private MovieParser parserMovie;
    private List<Movie> movies;
    private ActorParser parserActor;
    private List<Actor> actors;
    private MovieDatabaseSummarizer summarizer;
    private Summary summary;

    SummaryTest(){
        parserMovie=new MovieParser();
        parserActor = new ActorParser();
        summarizer=new MovieDatabaseSummarizer();
        summary=summarizer.summarize(movies , actors);
        movies= parserMovie.getMovies();
        actors=parserActor.getActors();
    }

    @Test
    void getTopRatedMovies() {
        List<String> topRatedMovies = summary.getTopRatedMovies();
        assertEquals(Arrays.asList("Reckless (10.0)",
                "Girl in the Cadillac (10.0)",
                "The Haunted World of Edward D. Wood, Jr. (10.0)",
                "Carmen Miranda: Bananas Is My Business (10.0)",
                "Other Voices Other Rooms (10.0)"),topRatedMovies);
    }

    @Test
    void getTopHiredActors() {
        List<String> topHiredActors = summary.getTopHiredActors();
        assertEquals(Arrays.asList("Bess Flowers 82 times","Christopher Lee 69 times","Grey Griffin 59 times","Danny Trejo 54 times","Eric Roberts 52 times"),topHiredActors);

    }

    @Test
    void getTopGenresMovies() {
        List<String> topGenresMovies = summary.getTopGenresMovies();
        assertEquals(Arrays.asList("Drama 14495 times","Comedy 8955 times"),topGenresMovies);
    }


    @Test
    public void PercentOfMaleAndPercentOfFemale(){
        Float actorsFemaleRatio = summary.getActorsFemaleRatio();
        Float actorsMaleRatio = summary.getActorsMaleRatio();
        assertEquals("65.72689" , String.valueOf(actorsFemaleRatio));
        assertEquals("34.2731" , String.valueOf(actorsMaleRatio));
    }
}