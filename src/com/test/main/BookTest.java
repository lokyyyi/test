package com.test.main;

import com.test.book.Book;

public class BookTest {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("자바");
		System.out.println(book.getTitle());
		
		book.setPrice(10000);
		System.out.println(book.getPrice());
	}

}
