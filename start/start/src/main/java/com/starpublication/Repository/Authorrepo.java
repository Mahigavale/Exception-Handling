package com.starpublication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starpublication.Entity.Author;

public interface Authorrepo extends JpaRepository<Author, Integer> {

}
