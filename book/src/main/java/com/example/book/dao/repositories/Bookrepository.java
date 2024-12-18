package com.example.book.dao.repositories;

import com.example.book.dao.entities.book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<book, Long> {
     List<book> findByTitle(String title);
}




