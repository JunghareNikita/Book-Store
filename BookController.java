package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Books;
import com.example.demo.service.BookServiceImpl;


@Controller
public class BookController {

	@Autowired
	private BookServiceImpl bookSer;
	
	
	@PostMapping("/save")
	public String saveData(Books book) {
		bookSer.saveBook(book);
		return "data save";
	}
	
	@PutMapping("/update/{id}")
	public Books updateData(@RequestBody Books book, @PathVariable Integer id) {
		Books b = bookSer.getBookById(id);
		Books book1 = new Books();
		book1.setId(id);
		book1.setBookName(book.getBookName());
		book1.setAuthor(book.getAuthor());
		book1.setPublishedYear(book.getPublishedYear());
		book1.setBookCategory(book.getBookCategory());
		book1.setNumOfCopy(book.getNumOfCopy());
		Books book2 = bookSer.updateBook(book1);
		return book2;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable Integer id) {
		bookSer.deleteBook(id);
	}
	
	@GetMapping("/get/{id}")
	public Books findById(@PathVariable Integer id) {
		Books book = bookSer.getBookById(id);
		Books b = new Books();
		if(book != null) {
			BeanUtils.copyProperties(book, b);
		}
		return b;
	}
	
//	@GetMapping("/getAll")
//	public List<Books> findAll(){
//		List<Books> bookList = bookSer.getAllBooks();
//		List<Books> bookModelList = new ArrayList<>();
//		Books bookModel = null;
//		
//		for (Books entity:bookList) {
//			Books model = new Books();
//			BeanUtils.copyProperties(entity, model);
//			bookModelList.add(model);
//		}
//		return bookModelList;
		
//	}
	
	@RequestMapping("/view")
	public String viewBooks(Model model) {
		model.addAttribute("book",bookSer.getAllBooks());
        return "view_all_book";   
	}

	@RequestMapping("/form")
	public String index(Model model) {
		model.addAttribute("users",bookSer.getAllBooks());
        return "form";  
	}
}
