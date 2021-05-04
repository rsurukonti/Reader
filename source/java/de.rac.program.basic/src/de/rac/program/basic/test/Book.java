package de.rac.program.basic.test;

import de.rac.program.basic.BaseNode;

public class Book extends BaseNode{

	private String title;
	private String author;
	private int year;
	private double price;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String getElementName() {
		return "Book";
	}

}
