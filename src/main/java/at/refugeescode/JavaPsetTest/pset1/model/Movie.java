package at.refugeescode.JavaPsetTest.pset1.model;

import org.springframework.stereotype.Component;

import java.util.List;


public class Movie {

        private String name;
        private List<String> genre;
        private Float rating;


        public void setName(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }



        public void setRating(Float rating){
            this.rating = rating;
        }

        public Float getRating() {
            return rating;
        }



        public List<String> getGenre() {
            return genre;
        }

        public void setGenre(List<String> genre){
            this.genre = genre;
        }


        @Override
        public String toString() {
            return "name=" + name + "   " + "Rating=" + rating+ "   " + "gender=" + genre;
        }
    }


