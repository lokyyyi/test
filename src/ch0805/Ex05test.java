package ch0805;

public class Ex05test {
	
	public  static void main(String[] args) {
		
		EBook book = new EBook();
		book.setTitle("자바문법");
		
		book.printTitle();
		
		book.printAllTitle();
	}

}

class Book{
	String title;
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void printTitle() {
		System.out.println("부모 " + title);
	}
}

class EBook extends Book{
	String title;
	
	void setTitle(String title) {	
		super.setTitle(title);
		this.title = "e북 " + title;
	}
	
	void printTitle() {
		System.out.println("자식 " + title);
	}
	
	void printAllTitle() {
		super.printTitle();
		printTitle();
		
	}
}
/*
문제 1.
제목 설정 메소드를 부모클래스와 자식클래스에 모두 작성하고 자식클래스의 제목 설정 메소드는 제목에 [이북]이 추가되도록 작성하세요.
부모의 타이틀과 자식의 타이틀 모두 출력하세요. 
*/