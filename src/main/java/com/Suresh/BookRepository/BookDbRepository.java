package com.Suresh.BookRepository;

import org.springframework.data.repository.CrudRepository;

import com.Suresh.Book.BookDb;

public interface BookDbRepository extends CrudRepository<BookDb, Integer> {

}
