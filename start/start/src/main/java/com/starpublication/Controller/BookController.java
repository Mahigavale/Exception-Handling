package com.starpublication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starpublication.Entity.Book;
import com.starpublication.Repository.Bookrepo;

@RestController
public class BookController {

	
	@Autowired
	private Bookrepo repo;
	
	@PostMapping("/add-book")
	public String addbook(@RequestBody Book book)
	{
		repo.save(book);
		
		return "Book with the name"+ book.getBookname() +"is saved !";
	}
	
	
	@GetMapping("/get-books")
	public List<Book> getall()
	{
		return repo.findAll();
	}
}
