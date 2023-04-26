package ch0710;

public class Ex10ThisConstructor {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book.printInfo(b1);
		
		Book b2 = new Book("자바8 문법");
		Book.printInfo(b2);
		
		Book b3 = new Book("파이썬 문법", 35000);
		Book.printInfo(b3);
		
		Book b4 = new Book("sql문법", 38000, "엘컴퓨터학원");
		Book.printInfo(b4);
		
	}

}

class Book {
	String title;
	int price;
	String author;
	
	Book(){
		this("제목입력", 0, "저자입력");
	}
	
	Book(String title){
		this(title, 0,"저자입력");
	}
	
	Book(String title, int price){
		this(title, price, "저자입력");
	}
	
	Book(String title, int price, String author){
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	static void printInfo(Book bx) {
		System.out.printf("제목: %s%n가격: %d%n저자: %s%n%n", bx.title, bx.price, bx.author);
	}
}
