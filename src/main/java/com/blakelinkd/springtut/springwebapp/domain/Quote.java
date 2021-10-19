package com.blakelinkd.springtut.springwebapp.domain;
import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import antlr.collections.List;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Float id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("quotes")
    private ArrayList<Text> text = new ArrayList<Text>();
    

    public Quote() {
        super();
    }

    public Quote(Float id, String type, ArrayList<Text> text) {
        this.id = id;
        this.type = type;
        this.text = text;
    }

    public Float getId() {
        return this.id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Text> getText() {
        return this.text;
    }

    public void setText(ArrayList<Text> text) {
        this.text = text;
    }

    public Quote id(Float id) {
        setId(id);
        return this;
    }

    public Quote type(String type) {
        setType(type);
        return this;
    }

    public Quote text(ArrayList<Text> text) {
        setText(text);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) o;
        return Objects.equals(id, quote.id) && Objects.equals(type, quote.type) && Objects.equals(text, quote.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, text);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", type='" + getType() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }
    

   

}
