package tn.isims.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.isims.demoproject.dao.BookRepository;
import tn.isims.demoproject.entities.Book;


@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository ;
    public static void main(String[] args) {

        SpringApplication.run(DemoProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Book book = bookRepository.save( new Book(null,"book ","145DG","alex",20));
        Book book_1 = bookRepository.save( new Book(null,"book 1","784HR","arnold",16));
        Book book_2 = bookRepository.save( new Book(null,"book 2","963ED","jack",11));

        bookRepository.findAll().forEach(book1 ->
                System.out.println(book1.toString()));

    }

}
