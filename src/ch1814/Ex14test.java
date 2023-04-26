package ch1814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Ex14test {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Collections.addAll(students, new Student(1, "철수"), new Student(3, "영희"), new Student(3, "둘리"), new Student(4, "또치"));
		
		System.out.println("< 문제1 >");
		Collections.sort(students, new AscendingNo1());
		System.out.println(students);
		System.out.println();
		
		System.out.println("< 문제2 >");
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student std1, Student std2) {
				int result = Integer.valueOf(std1.getNo()).compareTo(std2.getNo()) * -1;
				if (result == 0)
					result = std1.getName().compareTo(std2.getName()) * -1;
				return result;
			}
		});
		
		System.out.println(students);
		System.out.println();
		
		System.out.println("------");
		
		PriorityQueue<Book> books = new PriorityQueue<>();
		Collections.addAll(books, new Book(100), new Book(200), new Book(300));
		
		Collections.sort(books);
	}
}

class AscendingNo1 implements Comparator<Student> {
	
	@Override
	public int compare(Student std1, Student std2) {
		int result = Integer.valueOf(std1.getNo()).compareTo(std2.getNo()) * -1;
		if (result == 0)
			result = std1.getName().compareTo(std2.getName());
		return result;
	}
}

class Student implements Comparable<Student> {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Student std) {
		int result = Integer.valueOf(no).compareTo(std.getNo()) * -1;
		if (result == 0)
			result = name.compareTo(std.name);
		return result;
	}
	
	@Override
	public String toString() {
		return "(" + no + ", " + name + ")";
	}
}
class Des implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		int result = Integer.valueOf(book1.getPrice()).compareTo(book2.getPrice());
		return result;
	}
}
class Book implements Comparable<Book> {
	private int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(Book book) {
		int result = Integer.valueOf(price).compareTo(book.getPrice()) * -1;
		return result;
	}
}