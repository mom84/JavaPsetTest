package at.refugeescode.JavaPsetTest.pset1.parser;

import at.refugeescode.JavaPsetTest.pset1.model.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser {

    public List<Movie> getMovies() {
        String filePath = "src/oop/pset1/data/movies.csv";
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .filter(line -> line.length == 24)
                    .map(toMovie())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private Function<String[], Movie> toMovie() {
        return columns -> {
            Movie movie = new Movie();
            movie.setName(columns[20]);
            Float vote = Float.parseFloat(columns[22]);
            movie.setRating(vote);
            movie.setGenre(toGeneres(columns[3]));
            return movie;
        };
    }

    private static List<String> toGeneres(String column) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("[0-9]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("\\'name\\': ", "");
        objects = objects.replaceAll("\\'id\\': ", "");
        objects = objects.replaceAll("\\'", "");
        objects = objects.replaceAll(" ", "");
        objects = objects.replaceAll(",,", ",");
        String[] words = objects.split(",");
        return Stream.of(words)
                .filter(e -> e.length()!=0)
                .collect(Collectors.toList());
    }

}
