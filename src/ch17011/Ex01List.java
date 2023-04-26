package ch17011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex01List {
	
	public static void main(String[] args) {
		Book b1
	}

}

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

class Cart {
	private List<Book> books;
	
	public Cart() {
		books = new ArrayList<Book>(2);
	}
	
	public void add(Book book) {
		books.add(book)
	}
}