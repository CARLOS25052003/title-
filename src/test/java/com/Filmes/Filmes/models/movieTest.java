package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class movieTest {

    Movie movie1 = new Movie("deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe, OptionalDouble.of(4.5));
    Movie movie2 = new Movie("Red 2", Genre.ACAO, 2019, "David trust", 220, Cine.Deluxe, OptionalDouble.of(4.2));
    Movie movie3 = new Movie("Homem-aranha", Genre.ACAO, 2016, "Luiz gumares", 140, Cine.Private, OptionalDouble.of(4.9));

    ArrayList<Movie> movies = new ArrayList<Movie>(
            Arrays.asList(movie1, movie2)
    );

    Poster poster = new Poster(movies);


    @Test
    void tira_cartaz() {
        poster.removeMovie(movie1);
        assertEquals(1, poster.movies.size());
        assertFalse(poster.movies.contains(movie1));
    }
    @Test
    void add_movie(){
        assertEquals(2, poster.movies.size());
        poster.addMovie(movie3);
        assertEquals(3, poster.movies.size());
        assertTrue(poster.movies.contains(movie3));
    }


}