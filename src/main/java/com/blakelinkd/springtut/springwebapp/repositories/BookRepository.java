package com.blakelinkd.springtut.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.blakelinkd.springtut.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
