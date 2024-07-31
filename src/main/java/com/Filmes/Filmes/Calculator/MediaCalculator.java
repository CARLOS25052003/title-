package com.Filmes.Filmes.Calculator;

import com.Filmes.Filmes.models.Movie;

import java.util.List;
import java.util.OptionalDouble;

//public class MediaCalculator implements AverengeCalculator {
//    @Override
//    public double calcularMedia(List<Movie> movies) {
//        double soma = 0.0;
//        int count = 0;
//
//        for (Movie movie : movies) {
//            Double assessment = movie.getAssessment();
//            if (assessment != null) {
//                soma += assessment;
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            return 0.0; // Evita divisão por zero
//        }
//
//        return soma / count;
//   }
//}