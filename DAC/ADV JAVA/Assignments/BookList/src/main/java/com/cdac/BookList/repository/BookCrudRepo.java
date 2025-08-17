package com.cdac.BookList.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdac.BookList.entity.Book;

public interface BookCrudRepo extends CrudRepository<Book, Long> {

}
