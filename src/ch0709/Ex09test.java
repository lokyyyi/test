package ch0709;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex09test {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		
		Book b2 = new Book("자바");
		b2.printInfo();
		
		Book b3 = new Book("자바", 2000);
		b3.printInfo();
		
		Book b4 = new Book("자바", 1000, "현록");
		b4.printInfo();
	}

}

class Book {
	String title;
	int price;
	String author;
	
	Book(){
		this.title = "r";
		this.price = 0;
		this.author = "s";
		System.out.println(title + "\n" + price + "\n" + author + "\n");
	}
	
	Book(String title){
		this.title = title;
		this.price = 1000;
		this.author = "록";
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
		this.author = "륙";
	}
	
	Book(String title, int price, String author){
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	void printInfo() {
		System.out.printf("제목: %s%n가격: %d%n저자: %s%n", title, price, author);
	}
}
/*
문제 1.
영화 제목(문자열), 상영시간(정수), 장르(문자열) 속성을 가진 클래스를 만들고 
생성자를 이용하여 속성을 설정한 뒤 출력하세요.
문제 2.
생성자 오버로딩을 이용해 생성자 세개를 추가하고
각각의 생성자를 이용하여 3개의 인스턴스를 생성후 정보를 출력하세요.  
*/