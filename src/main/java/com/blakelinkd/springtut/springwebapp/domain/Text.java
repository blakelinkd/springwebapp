package com.blakelinkd.springtut.springwebapp.domain;

import java.util.Objects;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {
    
    @Id
    private Float id;

    @JsonProperty("text")
    String text;


    public Text() {
        super();
    }

    public Text(Float id, String text) {
        this.id = id;
        this.text = text;
    }

    public Float getId() {
        return this.id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Text id(Float id) {
        setId(id);
        return this;
    }

    public Text text(String text) {
        setText(text);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Text)) {
            return false;
        }
        Text text = (Text) o;
        return Objects.equals(id, text.id) && Objects.equals(text, text.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }

}
