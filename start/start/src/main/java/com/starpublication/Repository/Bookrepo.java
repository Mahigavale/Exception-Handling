package com.starpublication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starpublication.Entity.Book;

public interface Bookrepo extends JpaRepository<Book, Integer> {

}
