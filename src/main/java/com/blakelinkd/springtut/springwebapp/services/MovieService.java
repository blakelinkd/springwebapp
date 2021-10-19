package com.blakelinkd.springtut.springwebapp.services;

import com.blakelinkd.springtut.springwebapp.domain.Movie;

public interface MovieService {
    public abstract Movie getMovie();
    public abstract Movie findMovie(String movieTitle);
}
