package com.cdac.BookList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.BookList.entity.Book;
import com.cdac.BookList.exception.BookNotFoundException;
import com.cdac.BookList.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Book")
public class StudentController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/add-books")
	public ResponseEntity<Book> addBook(@Valid @RequestBody Book book){
		Book added = bookService.addBook(book);
		return new ResponseEntity<>(added, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get-books")
	public ResponseEntity<Iterable<Book>> getAllBook(){
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	
	@GetMapping("/get-books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		return bookService.getBookById(id)
				.map(ResponseEntity::ok)
				.orElseThrow(() -> new BookNotFoundException("Book not Found "+ id));
	}
	
	@PutMapping("/update-books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @Valid @RequestBody Book book){
		Book updated = bookService.updateBookById(id, book);
		return ResponseEntity.ok(updated);
	}
	
	
	@DeleteMapping("/delete-book/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Long id){
		bookService.deleteBookById(id);
		return ResponseEntity.noContent().build();
	}
	
}
