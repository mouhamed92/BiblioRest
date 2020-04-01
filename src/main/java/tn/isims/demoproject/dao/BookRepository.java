package tn.isims.demoproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isims.demoproject.entities.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
}
