package com.Filmes.Filmes.controller;

import com.Filmes.Filmes.enuns.Cine;
import com.Filmes.Filmes.enuns.Genre;
import com.Filmes.Filmes.models.Movie;
import com.Filmes.Filmes.models.Poster;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@Controller
public class filmeController {
    Movie movie1 = new Movie(gerarID(), "deadpoll", Genre.COMEDIA, 2021, "ALan wert", 180, Cine.Deluxe);

    Movie movie2 = new Movie(gerarID(), "Red 2", Genre.ACAO, 2019, "David trust", 220, Cine.Deluxe);
    Movie movie3 = new Movie(gerarID(), "Homem-aranha", Genre.ACAO, 2016, "Luiz gumares", 140, Cine.Private);
    Movie movie4 = new Movie(gerarID(), "Amor Doce", Genre.ROMANCE, 2013, "Gentulio perus", 166, Cine.Public);
    Movie movie5 = new Movie(gerarID(), "Indiana-jones", Genre.AVENTURA, 1999, "Guto lima", 240, Cine.Public);
    Movie movie6 = new Movie(gerarID(), "Guerra-canudos", Genre.ACAO, 1978, "General otavis", 140, Cine.Private);


    public String gerarID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 6);
    }

    ArrayList<Movie> movies = new ArrayList<>(
            Arrays.asList(movie1, movie2, movie3)
    );

    ArrayList<Movie> movieWait = new ArrayList<>(
            Arrays.asList(movie4, movie5, movie6)
    );

    public double pegaMedia() {
        return movie1.somaAvaliacao / movie1.totalAvalia ;
    }

    Poster poster = new Poster(movies, movieWait);

    @ResponseBody
    @RequestMapping("/Movies")
    public Poster poster() {
        return poster;
    }

    @ResponseBody
    @RequestMapping("/{nome}")
    public Movie poster(@PathVariable String nome) {
        movie1.avalia(5);
        movie1.avalia(5);
        movie1.avalia(5);
        movie1.setNote();


        var movie = movies.stream().filter(it -> it.getTitle().equals(nome));
        return movie.findFirst().get();
    }
}


