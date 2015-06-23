package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;

/**
 * Created by apple on 15-6-22.
 */
public class MovieController {
    private static ArrayList<Movie> movieList = new ArrayList<Movie>();

    static {
        movieList.add(new Movie("The Shawshank Redemption", "1994", "Frank Darabont", 9.5, "unchecked"));
        movieList.add(new Movie("The World Unseen", "2007", "Shamim Sarif", 7.7, "unchecked"));
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public String checkoutMovieByName(String name) {
        for (Movie movie : movieList) {
            if (name.equals(movie.getName()) && movie.getStatus().equals("unchecked")) {
                movie.setStatus("checkout");
                return movie.getStatus();
            }
        }
        return "That movie is not available";
    }

}
