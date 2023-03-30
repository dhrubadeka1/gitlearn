package com.jpa.dao;


import org.springframework.data.repository.CrudRepository;

import com.jpa.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

	public Book findById(int id);

}
