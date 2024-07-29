package com.Filmes.Filmes.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Poster {
    @Getter
    @Setter
    private int durationDays;
    public ArrayList<Movie> movies;

    public Poster(ArrayList<Movie> movies) {
    this.movies = movies;
    }

public void addMovie(Movie movie) {
    movies.add(movie);
}
public void removeMovie(Movie movie) {
    movies.remove(movie);
}
}
