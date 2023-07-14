package ch1907;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class Ex07test {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("A", 30000));
		books.add(new Book("B", 20000));
		books.add(new Book("C", 40000));
		books.add(new Book("D", 70000));
		books.add(new Book("E", 10000));
		
		System.out.println("< 문제1 >");		//모든 책들의 정보를 책가격 기준 내림차순 정렬하여 출력하세요. 패러렐 스트림을 이용해야 합니다. 힌트) sorted와 Comparator를 사용하세요.		
		books
			.parallelStream()
			.sorted(Comparator.comparing(Book::getPrice, Comparator.reverseOrder()))
			.forEachOrdered(System.out::println);
		
	}

}

class Book implements Comparable<Book> {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitel() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price;
	}
	
	@Override
	public int compareTo(Book b) {
		return title.compareTo(b.title);
	}
}