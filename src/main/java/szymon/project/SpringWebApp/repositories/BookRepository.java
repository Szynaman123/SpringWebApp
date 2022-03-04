package szymon.project.SpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon.project.SpringWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

