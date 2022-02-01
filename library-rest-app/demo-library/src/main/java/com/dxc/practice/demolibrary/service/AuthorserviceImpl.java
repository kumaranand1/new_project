package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Author;
import com.dxc.practice.demolibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorserviceImpl implements Authorservice {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElseThrow();
    }

    @Override
    public Author getAuthorByEmail(String email) {

        return null;
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        Author author = getAuthorById(id);
        authorRepository.delete(author);

    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorByname(String name) {

        return null;
    }

}