package com.cdac.BookList.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.BookList.entity.Book;
import com.cdac.BookList.exception.BookNotFoundException;
import com.cdac.BookList.repository.BookCrudRepo;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	BookCrudRepo bookcrudrepo;
	
	@Override
	public Book addBook(Book book) {
		return bookcrudrepo.save(book);
	}

	@Override
	public Iterable<Book> getAllBooks() {
		return bookcrudrepo.findAll();
	}

	@Override
	public Optional<Book> getBookById(Long id) {
		return bookcrudrepo.findById(id);
	}

	@Override
	public Book updateBookById(Long id, Book book) {
		Book exisitingBook = bookcrudrepo.findById(id)
							.orElseThrow(() -> new BookNotFoundException("Update not possible: Book is not found " + id));
		exisitingBook.setAuthor(exisitingBook.getAuthor());
		exisitingBook.setPrice(exisitingBook.getPrice());
		exisitingBook.setTitle(exisitingBook.getTitle());
		
		return bookcrudrepo.save(book);
	}

	@Override
	public boolean deleteBookById(Long id) {
		if(!bookcrudrepo.existsById(id)) {
			throw new BookNotFoundException("Book not Found to delete Record "+ id);
		}
		bookcrudrepo.deleteById(id);
		return true;
	}

}
