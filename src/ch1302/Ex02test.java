package ch1302;

public class Ex02test {
	
	public static void main(String[] args) {
		Book book = new Book("d", "dd", 1);
		Book book1 = new Book("d", "dd", 1);
		
		System.out.println(book.equals(book1));
		
		Book1 book2 = new Book1("d", "dd", 1);
		Book1 book3 = new Book1("d", "dd", 1);
		
		System.out.println(book2.equals(book3));
		
		
	}

}
class Book {
	private String title;
	private String author;
	private int edition;
	
	public Book(String title, String author, int edtion) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
}

class Book1 {
	private String title;
	private String author;
	private int edition;
	
	public Book1(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book1))
			return false;
		Book1 book = (Book1)obj;
		return title.equals(book.title) && author.equals(book.author) && edition == book.edition;
	}
}



/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
equals 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 true 를 반환하도록 코딩하세요. 
*/