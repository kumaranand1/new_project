package com.dxc.practice.demolibrary.controllers;
import java.time.LocalDate;
import java.util.List;

import com.dxc.practice.demolibrary.model.Book;
import com.dxc.practice.demolibrary.repository.BookRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Bookcontroller {

  private final BookRepository repository;

  Bookcontroller(BookRepository repository) {
    this.repository = repository;
  }


 
  @GetMapping("/books")
  List<Book> all() {
    return repository.findAll();
  }
  

  @PostMapping("/books")
  Book newBook(@RequestBody Book newBook) {
    return repository.save(newBook);
  }

 
  
  @GetMapping("/books/{id}")
  Book one(@PathVariable Integer id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new BookNotFoundException(id));
  }

  @PutMapping("/books/{id}")
  Book replaceBook(@RequestBody Book newBook, @PathVariable Integer id) {
    
    return repository.findById(id)
      .map(book -> {
        book.setTitle(newBook.getTitle());
        book.setIsbn(newBook.getIsbn());
        book.setPublicationDate(LocalDate.now());
        return repository.save(book);
      })
      .orElseGet(() -> {
        newBook.setId(id);
        return repository.save(newBook);
      });
  }

  @DeleteMapping("/books/{id}")
  void deleteBook(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}