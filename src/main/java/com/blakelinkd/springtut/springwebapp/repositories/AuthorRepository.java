package com.blakelinkd.springtut.springwebapp.repositories;
import com.blakelinkd.springtut.springwebapp.domain.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
