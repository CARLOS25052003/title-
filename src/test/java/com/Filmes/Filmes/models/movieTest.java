package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

class movieTest {

    Movie movie1 = new Movie("deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe, OptionalDouble.of(4.5));
    Movie movie2 = new Movie("Red 2", Genre.ACAO, 2019, "David trust", 220, Cine.Deluxe, OptionalDouble.of(4.2));


    @Test
    void pegarCine() {

    }

}