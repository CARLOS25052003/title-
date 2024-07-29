package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class movieTest {

    Movie movie1 = new Movie(gerarID(), "deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe, OptionalDouble.of(4.5));
    Movie movie2 = new Movie(gerarID(), "Red 2", Genre.ACAO, 2019, "David trust", 220, Cine.Deluxe, OptionalDouble.of(4.2));
    Movie movie3 = new Movie(gerarID(), "Homem-aranha", Genre.ACAO, 2016, "Luiz gumares", 140, Cine.Private, OptionalDouble.of(4.9));

    ArrayList<Movie> movies = new ArrayList<Movie>(
            Arrays.asList(movie1, movie2)
    );

    Poster poster = new Poster(movies);


    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 6);
    }


    @Test
    void tira_cartaz() {

        poster.removeMovie(movie1);

        assertEquals(1, poster.movies.size());
        assertFalse(poster.movies.contains(movie1));

        poster.addMovie(movie1);

        assertEquals(2, poster.movies.size());
        assertTrue(poster.movies.contains(movie1));
    }

    @Test
    void add_movie() {
        assertEquals(2, poster.movies.size());

        poster.addMovie(movie3);

        assertEquals(3, poster.movies.size());
        assertTrue(poster.movies.contains(movie3));

    }

    @Test
    void Adicionar_2_movies() {
        assertEquals(2, poster.movies.size());

        poster.addMovie(movie2);

        assertEquals(3, poster.movies.size());

        poster.addMovie(movie2);

        assertEquals(4, poster.movies.size());
        System.out.println(poster.movies);
    }

    @Test
    void Testar_gerador_Id_aleatorio(){
        assertNotNull(movie1.getId());
    }


}