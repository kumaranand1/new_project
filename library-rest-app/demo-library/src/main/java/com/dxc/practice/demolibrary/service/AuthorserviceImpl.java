package com.dxc.practice.demolibrary.service;

import java.util.List;
import com.dxc.practice.demolibrary.model.Author;
import com.dxc.practice.demolibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorserviceImpl implements AuthorService {

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
    public User createAuthor(Author author) {
        return AuthorRepository.save(Author);
    }

    @Override
    public User updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
        Author author = getAuthorById(id);
        AuthorRepository.delete(Author);

    }

    @Override
    public List<Author> getAllAuthors() {
        return AuthorRepository.findAll();
    }

}