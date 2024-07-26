package com.Filmes.Filmes.models;

import com.Filmes.Filmes.enuns.Genre;
import lombok.Getter;
import lombok.Setter;
import lombok.*;

import java.util.OptionalDouble;

@Getter
@Setter
@AllArgsConstructor

public class Title {
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
    public OptionalDouble assessment;
    //calculo de avaliação de 5 total de nota/pessoas


}
