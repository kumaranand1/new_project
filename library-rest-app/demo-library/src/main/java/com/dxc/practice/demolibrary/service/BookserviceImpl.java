package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Book;
import com.dxc.practice.demolibrary.repository.Authorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookserviceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBookById(int id) {
        return BookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book getBookBy(String title) {

        return null;
    }

    @Override
    public Book createBook(Book Book) {
        return BookRepository.save(Book);
    }

    @Override
    public User updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        Book book = getBookById(id);
        BookRepository.delete(book);

    }

    @Override
    public List<Book> getAllBooks() {
        return BookRepository.findAll();
    }

}