package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;


@Getter
@Setter
@AllArgsConstructor

public class Title {
    @Getter
    @Setter
    public String id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private Genre genre;
    @Setter
    @Getter
    private int year;
    @Setter
    @Getter
    private String director;
    @Setter
    @Getter
    private int duration;
    @Getter
    @Setter
    public int totalAvalia;
    @Getter
    @Setter
    public double somaAvaliacao;

    public Title(String id, String title, Genre genre, int year, String director, int duration) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.totalAvalia = 0;
        this.somaAvaliacao = 0;
    }

    public void avalia (double nota) {
        somaAvaliacao += nota;
        totalAvalia++;
    }

    double pegaMedia() {
        return somaAvaliacao / totalAvalia;
    }


}

//Criar um usario
//Adicionar um banco de dados
//
//
//
//

//MOngoDB
//Angula
//