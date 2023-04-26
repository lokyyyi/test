package ch0810;

import ch08book.Book;

public class Ex10Package {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.title = "엘컴퓨터학원";
		System.out.println(book.getTitle());
	}

}
