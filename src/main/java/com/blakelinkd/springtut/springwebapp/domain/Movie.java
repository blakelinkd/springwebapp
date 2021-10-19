package com.blakelinkd.springtut.springwebapp.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    @Id
    @JsonProperty("imdbID")
    private String imdbID;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private Integer year;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Poster")
    private String posterUrl;



    public Movie() {
    }

    public Movie(String imdbID, String title, Integer year, String plot, String posterUrl) {
        this.imdbID = imdbID;
        this.title = title;
        this.year = year;
        this.plot = plot;
        this.posterUrl = posterUrl;
    }

    public String getImdbID() {
        return this.imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlot() {
        return this.plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPosterUrl() {
        return this.posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public Movie imdbID(String imdbID) {
        setImdbID(imdbID);
        return this;
    }

    public Movie title(String title) {
        setTitle(title);
        return this;
    }

    public Movie year(Integer year) {
        setYear(year);
        return this;
    }

    public Movie plot(String plot) {
        setPlot(plot);
        return this;
    }

    public Movie posterUrl(String posterUrl) {
        setPosterUrl(posterUrl);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(imdbID, movie.imdbID) && Objects.equals(title, movie.title) && Objects.equals(year, movie.year) && Objects.equals(plot, movie.plot) && Objects.equals(posterUrl, movie.posterUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imdbID, title, year, plot, posterUrl);
    }

    @Override
    public String toString() {
        return "{" +
            " imdbID='" + getImdbID() + "'" +
            ", title='" + getTitle() + "'" +
            ", year='" + getYear() + "'" +
            ", plot='" + getPlot() + "'" +
            ", posterUrl='" + getPosterUrl() + "'" +
            "}";
    }
    



}
