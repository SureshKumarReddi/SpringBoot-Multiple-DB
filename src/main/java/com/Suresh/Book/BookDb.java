package com.Suresh.Book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookDatabase")
public class BookDb {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bookName;
	private int price;
	
	public BookDb() {
		// TODO Auto-generated constructor stub
	}

	public BookDb(int id, String bookName, int price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDb [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
}
