package com.starpublication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starpublication.Entity.Author;
import com.starpublication.Exceptions.Contactexception;
import com.starpublication.Repository.Authorrepo;

@Service
public class AuthorService {

	
	//Business Logics.
	//repository=>Service=>Controller.
	
	@Autowired
	private Authorrepo repo;
	
	
	public String addauthor(Author author) throws Contactexception
	{
		if(author.getContact().length() !=10)
		{
			throw new Contactexception("invalid length");
		}
		else {
		repo.save(author);
		
		return "auhtor :with the name:"+ author.getName()+" is saved sucessfully !";
	}
	}
	
	public List<Author> getallservice()
	{
		System.out.println("getting the authors from author service.");
		
		return repo.findAll();
	
	}
}
