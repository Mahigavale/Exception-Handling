package com.starpublication.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Book {

	@Id
	private int bookid;
	private String bookname;
	private double bookprice;
	private LocalDate publishedon; //yyyy-mm-dd :=> 
	
	@JoinColumn(name="id")
	@ManyToOne
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
