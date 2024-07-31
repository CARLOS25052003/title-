package com.Filmes.Filmes.Calculator;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import com.Filmes.Filmes.models.Movie;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MediaCalculatorTest {

    Movie movie1 = new Movie(gerarID(), "deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe,0);


    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 6);
    }

    @Test
    void calcularMedia() {
       // MediaCalculator calculator = new MediaCalculator();
        movie1.avalia(2);
        movie1.avalia(5);
        assertEquals(3.5, movie1.pegaMedia());




    }

    @Test
    void media_is_4() {
        //Movie com 16 de Nota
        //Total de avaliações 4

        //Espera que o assert seja 4 ao calcular a media do movie especifíco
    }
}