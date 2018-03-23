package at.refugeescode.JavaPsetTest.pset1.model;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Summary {

    private List<String> topRatedMovies;

    private List<String> topGenresMovies;

    private List<String> topHiredActors;

    private Float FemaleActorsRatio;

    private Float MaleActorsRatio;


    public void setTopRatedMovies(List<String> topRatedMovies) {
        this.topRatedMovies = topRatedMovies;
    }

    public void setTopHiredActors(List<String> topHiredActors) {
        this.topHiredActors = topHiredActors;
    }

    public void setTopGenresMovies(List<String> topGenresMovies) {
        this.topGenresMovies = topGenresMovies;
    }

    public List<String> getTopRatedMovies() {
        return topRatedMovies;
    }

    public List<String> getTopHiredActors() {
        return topHiredActors;
    }

    public List<String> getTopGenresMovies() {
        return topGenresMovies;
    }

    public void setActorsMaleRatio(Float numberActorsMaleRatio) {
        this.MaleActorsRatio = numberActorsMaleRatio;
    }

    public Float getActorsMaleRatio() {
        return MaleActorsRatio;
    }

    public void setActorsFemaleRatio(Float numberActorsFemaleRatio) {
        this.FemaleActorsRatio = numberActorsFemaleRatio;
    }

    public Float getActorsFemaleRatio() {
        return FemaleActorsRatio;
    }
}
