package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Books;

public interface BookService {
	
	public Books saveBook(Books book);
	public Books updateBook(Books book);
	public void deleteBook(Integer id);
	public Books getBookById(Integer id);
	public List<Books> getAllBooks();
}
