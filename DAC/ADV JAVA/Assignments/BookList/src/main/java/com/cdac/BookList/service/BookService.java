package com.cdac.BookList.service;

import java.util.Optional;

import com.cdac.BookList.entity.Book;

public interface BookService {

	public Book addBook(Book book);
	public Iterable<Book> getAllBooks();
	public Optional<Book> getBookById(Long id);
	public Book updateBookById(Long id, Book book);
	public boolean deleteBookById(Long id);
}
