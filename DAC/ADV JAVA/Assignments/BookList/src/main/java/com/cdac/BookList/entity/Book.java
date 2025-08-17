package com.cdac.BookList.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="BookId")
	private Long id;
	
	@Column(name="BookTitle")
	@NotBlank(message = "Title should not be blank")
	private String title;
	
	@Column(name="BookAuthor")
	@NotBlank(message = "Author name should not be blank")
	private String author;
	
	@Min(value = 1, message ="Price value should be atleast one")
	@Column(name="BookPrice")
	private String price;

	public Book() {
		super();
	}

	public Book(Long id, String title, String author, String price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
