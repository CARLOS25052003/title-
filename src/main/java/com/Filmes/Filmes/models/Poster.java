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
        if (movie == null) {
            throw new IllegalArgumentException("Movie cannot be null");
        }

        var movieIds = movies.stream()
                .map(Movie::getId)
                .toList();

        if (!movieIds.contains(movie.getId()))
            movies.add(movie);

    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public void trocarMovie(Movie movie) {
        movies.remove(movie);
        movies.add(movie);
    }
}