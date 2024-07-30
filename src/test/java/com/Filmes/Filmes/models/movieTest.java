package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class movieTest {

    Movie movie1 = new Movie(gerarID(), "deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe, 4.5);
    Movie movie2 = new Movie(gerarID(), "Red 2", Genre.ACAO, 2019, "David trust", 220, Cine.Deluxe, 4.2);
    Movie movie3 = new Movie(gerarID(), "Homem-aranha", Genre.ACAO, 2016, "Luiz gumares", 140, Cine.Private, 4.9);
    Movie movie4 = new Movie(gerarID(), "Amor Doce", Genre.ROMANCE, 2013, "Gentulio perus", 166, Cine.Public, 4.0);
    Movie movie5 = new Movie(gerarID(), "Indiana-jones", Genre.AVENTURA, 1999, "Guto lima", 240, Cine.Public, 2.7);
    Movie movie6 = new Movie(gerarID(), "Guerra-canudos", Genre.ACAO, 1978, "General otavis", 140, Cine.Private, 1.9);

    public Queue<Movie> moviesQueue = new LinkedList<Movie>();

    public Queue<Movie> getMoviesQueue() {
        return moviesQueue;
    }

    ArrayList<Movie> movies = new ArrayList<>(
            Arrays.asList(movie1, movie2, movie3)
    );

    ArrayList<Movie> movieWait = new ArrayList<>(
            Arrays.asList(movie4, movie5, movie6)
    );

    Poster poster = new Poster(movies, movieWait);

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
    }

    @Test
    void Adici() {


        assertEquals(2, poster.movies.size());

        poster.addMovie(movie2);

        assertEquals(2, poster.movies.size());

        poster.addMovie(movie2);

        assertEquals(2, poster.movies.size());


    }

    @Test
    void Testar_gerador_Id_aleatorio() {
        assertNotNull(movie1.getId());
    }

    @Test
    void adicionar_fila_rotativa() {
        assertEquals(3, poster.movies.size());
        assertEquals(3, poster.movieWait.size());

        poster.removeMovie(movie1);

        assertTrue(poster.movieWait.contains(movie1));
        assertFalse(poster.movies.contains(movie1));
        assertEquals(2, poster.movies.size());
        assertEquals(4, poster.movieWait.size());
    }
}