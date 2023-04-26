package ch0711;

import java.util.Arrays;

//가변인자
public class Ex11Varargs {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바문법";
		book1.author = "엘컴퓨터학원";
		book1.setTag("컴퓨터", "IT", "프로그램 언어", "자바");
		
		Book.printInfo(book1);
		
		Book book2 = new Book();
		book2.title = "c 문법";
		book2.author = "엘코딩";
		book2.setTag("IT", "프로그램 언어");
		
		Book.printInfo(book2);
	}

}
class Book{
	String title;
	String author;
	String[] tag;
	
	void setTag(String... params) {
		//tag = params;
		tag = new String[params.length];
		for (int i=0; i<tag.length; i++) {
			tag[i] = params[i];
		}
	}
	
	static void printInfo(Book book) {
		System.out.printf("제목: %s%n저자: %s%n", book.title, book.author);
		System.out.printf("카테고리: %s%n%n", Arrays.toString(book.tag));
	}
}