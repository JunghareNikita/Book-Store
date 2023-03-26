package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.BookRepo;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;

	
	@Override
	public Books saveBook(Books book) {
		Books book1 = bookRepo.save(book);
		return book1;
	}

	@Override
	public Books updateBook(Books book) {
		Books book1 = bookRepo.save(book);
		return book1;
	}

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);
	}

	@Override
	public List<Books> getAllBooks() {
		List<Books> book1 = (List<Books>) bookRepo.findAll();
		return book1;
	}

	@Override
	public Books getBookById(Integer id) {
		Optional<Books> book1 = bookRepo.findById(id);
		Books b = book1.get();
		return b;
	}
}
