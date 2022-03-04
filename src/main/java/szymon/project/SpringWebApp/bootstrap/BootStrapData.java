package szymon.project.SpringWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import szymon.project.SpringWebApp.domain.Author;
import szymon.project.SpringWebApp.domain.Book;
import szymon.project.SpringWebApp.repositories.AuthorRepository;
import szymon.project.SpringWebApp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric= new Author("Eric","Evans");
        Book ddd= new Book("DDD","123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        Author rod=new Author("Rod","Johnson");
        Book noEJB= new Book("J2EE","321321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+bookRepository.count());



    }
}
