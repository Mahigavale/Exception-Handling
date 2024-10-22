package com.starpublication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.starpublication.Entity.Author;
import com.starpublication.Exceptions.Contactexception;
import com.starpublication.Repository.Authorrepo;
import com.starpublication.Service.AuthorService;

@CrossOrigin(allowedHeaders="*")
@RestController
public class Authorcontroller {
	
	

	
	@Autowired
	private AuthorService service;
	
	
	@PostMapping("/add-author")
	public String addauthor(@RequestBody Author author) throws Contactexception
	{
		
		return service.addauthor(author);
		
		
	}
	
	
	@GetMapping("/get-all")
	public List<Author> getall()
	{
		return service.getallservice();
	}

}
