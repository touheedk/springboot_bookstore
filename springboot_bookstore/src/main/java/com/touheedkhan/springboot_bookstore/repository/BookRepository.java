package com.touheedkhan.springboot_bookstore.repository;

import com.touheedkhan.springboot_bookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}