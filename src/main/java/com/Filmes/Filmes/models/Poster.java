package com.Filmes.Filmes.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

//@Document(Collection = "users")
public class Poster {
    @Getter
    @Setter
    private int durationDays;
    public ArrayList<Movie> movies;
    public ArrayList<Movie> movieWait;

    public Poster(ArrayList<Movie> movies, ArrayList<Movie> movieWait) {
        this.movies = movies;
        this.movieWait = movieWait;

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
        movieWait.add(movie);
    }

    public void trocarMovie(Movie movie) {
        movies.remove(movie);
        movies.add(movie);
    }
}