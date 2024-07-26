package com.Filmes.Filmes.models;


import lombok.Getter;
import lombok.Setter;


public class movie extends Title {
    @Setter
    @Getter
    private String cine;

    public movie(String title, String genre, int year, String director, int duration, String cine) {
        super(title, genre, year, director, duration);
        this.cine = cine;
    }



}

