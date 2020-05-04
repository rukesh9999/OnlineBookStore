package com.book.online.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.book.online.onlinebookstore.entity.BookCategory;
@Repository
@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
@CrossOrigin("*")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

	
}
