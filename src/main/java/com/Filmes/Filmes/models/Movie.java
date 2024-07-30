package com.Filmes.Filmes.models;


import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


public class Movie extends Title {
    @Setter
    @Getter
    private Cine cine;

    public Movie(String id, String title, Genre genre, int year, String director, int duration, Cine cine, Double assessment) {
        super(id, title, genre, year, director, duration, assessment);
        this.cine = cine;
        this.id = gerarID();
    }

    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 6);
    }
}

