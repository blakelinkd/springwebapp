package com.blakelinkd.springtut.springwebapp.repositories;
import org.springframework.data.repository.CrudRepository;
import com.blakelinkd.springtut.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
    
}
