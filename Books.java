package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String bookName;
	private String author;
	private Date publishedYear;
	private int numOfCopy;
	private String bookCategory;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int id, String bookName, String author, Date publishedYear, int numOfCopy, String bookCategory) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publishedYear = publishedYear;
		this.numOfCopy = numOfCopy;
		this.bookCategory = bookCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Date publishedYear) {
		this.publishedYear = publishedYear;
	}

	public int getNumOfCopy() {
		return numOfCopy;
	}

	public void setNumOfCopy(int numOfCopy) {
		this.numOfCopy = numOfCopy;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishedYear=" + publishedYear
				+ ", numOfCopy=" + numOfCopy + ", bookCategory=" + bookCategory + "]";
	}

	
	

}
