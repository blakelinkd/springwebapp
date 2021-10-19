package com.blakelinkd.springtut.springwebapp.bootstrap;

import com.blakelinkd.springtut.springwebapp.domain.Author;
import com.blakelinkd.springtut.springwebapp.domain.Book;
import com.blakelinkd.springtut.springwebapp.domain.Publisher;
import com.blakelinkd.springtut.springwebapp.repositories.AuthorRepository;
import com.blakelinkd.springtut.springwebapp.repositories.BookRepository;
import com.blakelinkd.springtut.springwebapp.repositories.PublisherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        
        Publisher publisher = new Publisher("Fart Books", "100 1st ave. 733433, MI, United States");
        publisherRepository.save(publisher);
        
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123445");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        

        
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);
        
        
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "234234234");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        
        
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);
        
        
        
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers. " + publisherRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }

}
