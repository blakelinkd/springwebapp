package com.blakelinkd.springtut.springwebapp.controllers;

import com.blakelinkd.springtut.springwebapp.repositories.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "/books/list";
    }

    // @RequestMapping("/error")
    // public String getError() {
    //     return "Error is bad.";
    // }
}
