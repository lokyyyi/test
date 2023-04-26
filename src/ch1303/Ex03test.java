package ch1303;

import java.util.Objects;

public class Ex03test {
	
	public static void main(String[] args) {
		Book b1 = new Book("dd", "dd");
		Book b2 = new Book("dd", "dd");
		Book b3 = new Book("dd", "ss");
		
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(b2));
		System.out.println(System.identityHashCode(b3));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		
		System.out.println(b1.hashCode() == b2.hashCode());
	}

}

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public int hashCode() {
		return Objects.hash(title, author);
	}
}
/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
hashCode 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 같은 해시코드를 반환하도록 코딩하세요. 
*/