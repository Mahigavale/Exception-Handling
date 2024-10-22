package com.starpublication.Entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookid;
	private String bookname;
	private double bookprice;
	private LocalDate publishedon; //yyyy-mm-dd :=> 
	
	//Jsonbackreference=:> no need to go back to owner table.
	
	@JoinColumn(name="id")
	@ManyToOne
	@JsonBackReference         
	private Author author;


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public double getBookprice() {
		return bookprice;
	}


	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}


	public LocalDate getPublishedon() {
		return publishedon;
	}


	public void setPublishedon(LocalDate publishedon) {
		this.publishedon = publishedon;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
