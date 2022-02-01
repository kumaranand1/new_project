package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Book;

import com.dxc.practice.demolibrary.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookserviceImpl implements Bookservice {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book createBook(Book Book) {
        return bookRepository.save(Book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        Book book = getBookById(id);
        bookRepository.delete(book);

    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookBytitle(String title) {
        
        return null;
    }

    @Override
    public Book getBookByisbn(int isbn) {
        
        return null;
    }

}