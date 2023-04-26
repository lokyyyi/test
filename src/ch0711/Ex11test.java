package ch0711;

import java.util.Arrays;

public class Ex11test {
	
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		b1.setAuthor("나", "너", "우리");
		Book1.printInfo(b1);
	}

}

class Book1{
	String[] author;
	
	void setAuthor(String...strings) {
		author = new String[strings.length];
		for (int i=0; i<strings.length; i++) {
			author[i] = strings[i];
		}
	}
	
	static void printInfo(Book1 book) {
		System.out.printf("%s",Arrays.toString(book.author));
	}
}
/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요. 
*/