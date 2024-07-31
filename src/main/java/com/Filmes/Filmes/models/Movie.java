package com.Filmes.Filmes.models;


import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.UUID;


public class Movie extends Title {
    @Setter
    @Getter
    private Cine cine;
    @Getter
    @Setter
    private String MediaFinal;

    public Movie(String id, String title, Genre genre, int year, String director, int duration, Cine cine) {
        super(id, title, genre, year, director, duration);
        this.cine = cine;
        this.id = gerarID();

    }
    public void setNote() {
        DecimalFormat df = new DecimalFormat("#.00");
        this.MediaFinal = df.format(pegaMedia());
        }

    public String getMediaFinal() {
        return this.MediaFinal;
    }

    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 6);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvalia++;
    }

    public double pegaMedia() {
        return somaAvaliacao / totalAvalia;
    }


}

