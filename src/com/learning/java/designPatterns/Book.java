package com.learning.java.designPatterns;

public class Book {
	
	private String title ;
	private String  author ;
	private int noOfPages;
	private double price;
	
	private Book(BookBuilder builder) {
		this.title = builder.title;
		this.author = builder.author;
		this.noOfPages = builder.noOfPages;
		this.price = builder.price;
	}

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

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", noOfPages=" + noOfPages + ", price=" + price + "]";
	}
	
	
	public static class BookBuilder{
		private String title ;
		private String  author ;
		private int noOfPages;
		private double price;
		

		
		
		public BookBuilder titleM(String title) {
			this.title = title;
			return this;
			
		}
		
		public BookBuilder authorM(String author) {
			this.author = author;
			return this;
			
		}
		public BookBuilder noOfPagesM(int noOfPages) {
			this.noOfPages = noOfPages;
			return this;
			
		}
		public BookBuilder priceM(double price) {
			this.price = price;
			return this;
			
		}
		public BookBuilder withOutPages() {
			this.noOfPages =0;
			return this;
		}
		
		public Book build() {
			return new Book(this);
		}
		
		
	}
	
	

}
