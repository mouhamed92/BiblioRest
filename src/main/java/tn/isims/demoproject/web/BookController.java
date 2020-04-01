package tn.isims.demoproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isims.demoproject.dao.BookRepository;
import tn.isims.demoproject.entities.Book;
import tn.isims.demoproject.metier.ISomme;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository ;

    @Autowired
    ISomme iSomme ;

    @GetMapping("books")
    public List<Book> list(){
        List<Book> list = bookRepository.findAll();
        return list ;
    }

    @GetMapping("books/{id}")
    public Book find(@PathVariable("id") Long id){
        Book book = bookRepository.findById(id).get();
        return book ;
    }

    @PostMapping("add")
    public void add(@RequestBody Book book){
        bookRepository.save(book);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable("id") Long id , @RequestBody Book book){
        Book book1 = bookRepository.findById(id).get();
        book1.setTitle(book.getTitle());
        book1.setIsbn(book.getIsbn());
        book1.setAuthor(book.getAuthor());
        bookRepository.save(book1);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){

        Book book1 = bookRepository.findById(id).get();
        bookRepository.delete(book1);

    }

    @GetMapping("somme/{id}")
    public double somme(@PathVariable("id") long id){
        Book book = bookRepository.findById(id).get();
        double total = iSomme.sommeTotal(book.getPrix(),3,book.getId());
        return total ;
    }
}
