package com.blakelinkd.springtut.springwebapp.services;

import com.blakelinkd.springtut.springwebapp.domain.Quote;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteServiceImpl implements QuoteService {
    private RestTemplate restTemplate;

    public QuoteServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    @Override
    public Quote getQuote() {
        String restString = "https://goquotes-api.herokuapp.com/api/v1/random?count=5";
        Quote result = restTemplate.getForObject(
            restString, Quote.class);
        System.out.println(result.toString());
        return result;
        
    }
    
}
