package com.blakelinkd.springtut.springwebapp.controllers;

import com.blakelinkd.springtut.springwebapp.domain.Movie;
import com.blakelinkd.springtut.springwebapp.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {
    
    @Autowired
    MovieService movieService;


    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/")
    public String getMovie(Model model) {
        model.addAttribute("movie", movieService.getMovie());
        return "movie";
    }

    @RequestMapping(value = "/movie/{movieTitle}")
    @ResponseBody
    public Movie findMovie(@PathVariable String movieTitle) {
        return movieService.findMovie(movieTitle);
    }
}
