package com.starpublication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starpublication.Entity.Author;
import com.starpublication.Repository.Authorrepo;

@RestController
public class Authorcontroller {
	
	
	@Autowired
	private Authorrepo repo;
	
	
	@PostMapping("/add-author")
	public String addauthor(@RequestBody Author author)
	{
		repo.save(author);
		
		return author.getName()+"is saved sucessfully !";
	}
	
	
	@GetMapping("/get-all")
	public List<Author>   getall()
	{
		return repo.findAll();
	}

}
