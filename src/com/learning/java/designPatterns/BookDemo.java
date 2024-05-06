package com.learning.java.designPatterns;



public class BookDemo {
	
	public static void main(String[] args) {
//		BookBuilder  BB = new BookBuilder();
		Book.BookBuilder builder = new Book.BookBuilder();
		
		Book book1 = builder.authorM("peter")
				           .titleM("No Way Home")
				           .noOfPagesM(345)
				           .priceM(18.35)
				           .build();
		
		System.out.println(book1);
		
		Book book2 = builder.authorM("peter")
		           .titleM("No Way Home")
		           .priceM(18.35)
		           .withOutPages()
		           .build();
		System.out.println(book2);
	}

}
