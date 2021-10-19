package com.blakelinkd.springtut.springwebapp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();


    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Author firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public Author lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

   

    public Author books(Set<Book> books) {
        setBooks(books);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Author)) {
            return false;
        }
        Author author = (Author) o;
        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", books='" + getBooks() + "'" +
            "}";
    }

    

}