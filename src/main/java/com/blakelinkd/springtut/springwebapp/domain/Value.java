package com.blakelinkd.springtut.springwebapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("quote")
    private String quote;

    public Value() { 
        super();
    }
      public Value(Long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

  public Long getId() {
    return this.id;
  }

  public String getQuote() {
    return this.quote;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Value)) {
            return false;
        }
        Value value = (Value) o;
                return id != null ? id.equals(value.id) : value.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

  @Override
  public String toString() {
    return "Value{" +
        "id=" + id +
        "quote=" + quote + 
        '}';
  }
}