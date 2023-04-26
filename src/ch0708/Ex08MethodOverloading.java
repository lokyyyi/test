package ch0708;

//메소드 오버로딩 (다형성)

public class Ex08MethodOverloading {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setInfo("자바8.0문법");
		System.out.println(book.getInfo());
		
		book.setInfo("c문법", 35000);
		System.out.println(book.getInfo());
		
		book.setInfo("파이썬문법", 30000, "엘컴퓨터학원");
		System.out.println(book.getInfo());
		
		System.out.println(book.setInfo());
		System.out.println(book.getInfo());
	}

}
class Book{
	String title;
	int price;
	String author;
	
	void setInfo(String title) {
		this.title = title;
	}
	
	void setInfo(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void setInfo(String title, int price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	String setInfo() {
		this.title = "";
		this.price = 0;
		this.author = "";
		
		return "책의 정보가 초기화되었습니다.";
	}
	
	String getInfo() {
		return "제목: " + title + "\n가격: " + price + "\n저자: " + author + "\n";
	}
}