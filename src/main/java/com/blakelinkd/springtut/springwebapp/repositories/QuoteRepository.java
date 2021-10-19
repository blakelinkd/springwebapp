package com.blakelinkd.springtut.springwebapp.repositories;
import org.springframework.data.repository.CrudRepository;
import com.blakelinkd.springtut.springwebapp.domain.Quote;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
    
}
