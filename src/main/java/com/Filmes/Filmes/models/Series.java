package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Genre;
import lombok.Getter;
import lombok.Setter;

public class Series extends Title {
    @Getter
    @Setter
    public int eps;


    public Series(String id, String title, Genre genre, int year, String director, int duration, Double assessment, int eps) {
        super(id, title, genre, year, director, duration, assessment);
        this.eps = eps;
    }
}
