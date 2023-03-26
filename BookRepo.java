package com.example.demo.repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Books;

@Repository
public interface BookRepo extends JpaRepository<Books, Integer> {

	Books save(Book book);

}
