package com.dxc.practice.demolibrary.repository;

import com.dxc.practice.demolibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer> {
    
}
