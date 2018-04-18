package com.dss.complexdatatypes;

public class ComplexDataTypes {
	
	private String name;
	private String book;
	private int price;
	public ComplexDataTypes(String name, String book, int price) {
		super();
		this.name = name;
		this.book = book;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
