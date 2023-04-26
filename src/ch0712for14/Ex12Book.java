package ch0712for14;

import java.util.Scanner;

public class Ex12Book {
	String title;
	String author;
	int bookNo;
	
	int price;
	
	Ex12Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	Ex12Book(){
	}

	// int bookNo = book.bookNo;
	// bookNo = 1000;
	static int generateBookNo(int bookNo) {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}
	
	// Ex12Book book = book2;
	static void generateBookNo(Ex12Book book) {
		book.bookNo = (int)(Math.random()*9000)+1000;
		
	}
	
	static int priceSet(int price) {
		return price;
		
	}
	
	static void priceSet(Ex12Book book) {
		book.price = 3000; 
	}
}
