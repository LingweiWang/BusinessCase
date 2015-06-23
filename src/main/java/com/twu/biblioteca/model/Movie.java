package com.twu.biblioteca.model;

/**
 * Created by apple on 15-6-20.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private double rating ;
    private String status;

    public Movie(String name, String year, String director, double rating, String status){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
