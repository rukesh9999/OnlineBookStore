package com.book.online.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.book.online.onlinebookstore.entity.Book;

@CrossOrigin("*")
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
  
	
}
