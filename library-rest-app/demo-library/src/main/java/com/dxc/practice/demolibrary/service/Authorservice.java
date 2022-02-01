package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Author;

public interface Authorservice {

    public Author getAuthorById(int id);
    
    public Author getAuthorByname(String name);

    public Author getAuthorByEmail(String email);

    public Author createAuthor(Author author);

    public Author updateAuthor(Author author);

    public void deleteAuthor(int id);

    public List<Author> getAllAuthors();

    
}