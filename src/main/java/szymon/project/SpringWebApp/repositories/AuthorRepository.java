package szymon.project.SpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import szymon.project.SpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
