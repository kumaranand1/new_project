package com.dxc.practice.demolibrary.repository;
import com.dxc.practice.demolibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author,Integer> {
    
}

