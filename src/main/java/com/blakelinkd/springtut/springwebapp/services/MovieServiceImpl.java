package com.blakelinkd.springtut.springwebapp.services;

import com.blakelinkd.springtut.springwebapp.domain.Movie;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService {
    private RestTemplate movieTemplate;

    public MovieServiceImpl() {
        this.movieTemplate = new RestTemplate();
    }

    @Bean
    public RestTemplate movieTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public Movie getMovie() {
        String restString = "https://www.omdbapi.com/?t=doom&apikey=e4eff41b";
        Movie result = movieTemplate.getForObject(
            restString, Movie.class);
            return result;
    }

    @Override
    public Movie findMovie(String movieTitle) {
        String request = String.format("https://www.omdbapi.com/?t=%s&apikey=e4eff41b",
        movieTitle);
        Movie result = movieTemplate.getForObject(
            request, Movie.class);
            return result;
    }
}
