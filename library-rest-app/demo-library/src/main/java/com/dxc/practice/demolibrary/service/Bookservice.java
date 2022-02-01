package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Book;

public interface Bookservice {

    public Book getBookById(int id);

    public Book getBookBytitle(String title);

    public Book getBookByisbn(int isbn);

    public Book createUser(Book book);

    public Book updateUser(Book book);

    public void deleteUser(int id);

    public List<Book> getAllBooks();

}