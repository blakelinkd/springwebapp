package com.blakelinkd.springtut.springwebapp.controllers;
import com.blakelinkd.springtut.springwebapp.repositories.QuoteRepository;
import com.blakelinkd.springtut.springwebapp.services.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
    // private final QuoteRepository quoteRepository;

    @Autowired
    QuoteService quoteService;

public QuoteController(QuoteService service) {
        this.quoteService = service;
    }


    @RequestMapping("/quote")
    public String getQuote(Model model) {
        model.addAttribute("quote", quoteService.getQuote());
        return "quote";
    }

    
}
