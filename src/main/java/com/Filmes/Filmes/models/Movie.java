package com.Filmes.Filmes.models;


import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.OptionalDouble;


public class Movie extends Title {
    @Setter
    @Getter
    private Cine cine;

    public Movie(String title, Genre genre, int year, String director, int duration, Cine cine, OptionalDouble assessment) {
        super(title, genre, year, director, duration,assessment);
       this.cine = cine;
    }


}

