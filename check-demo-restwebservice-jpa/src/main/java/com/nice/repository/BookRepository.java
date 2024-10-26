package com.nice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nice.entity.*;

public interface BookRepository extends JpaRepository<Book, Long> {
	// Create / Update // delete / List operation 
	
	// Cutome // JPQL 
}