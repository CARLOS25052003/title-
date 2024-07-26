package com.Filmes.Filmes.models;

import lombok.Getter;
import lombok.Setter;
import lombok.*;

import java.util.Optional;
import java.util.OptionalDouble;

@Getter
@Setter
@AllArgsConstructor

public class Title {
    private String title;
    @Getter
    @Setter
    private String genre;
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
    private OptionalDouble assessment;
    //calculo de avaliação de 5 total de nota/pessoas


}
