package ch1302;

public class Ex02Equals {
	
	public static void main(String[] args) {
		Book3 b1 = new Book3("자바 컬렉션", "엘컴퓨터학원", 2);
		Book3 b2 = new Book3("자바 알고리즘", "엘컴퓨터학원", 7);
		Book3 b3 = new Book3("자바 알고리즘", "엘컴퓨터학원", 7);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		System.out.println();
		
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b2.equals(b3));
		System.out.println();
		
		Book4 b4 = new Book4("자바 컬렉션", "엘컴퓨터학원", 2);
		Book4 b5 = new Book4("자바 알고리즘", "엘컴퓨터학원", 7);
		Book4 b6 = new Book4("자바 알고리즘", "엘컴퓨터학원", 7);
		
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b4.equals(b5));
		System.out.println();
		
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b5.equals(b6));
		
		String s1 = new String("안녕하세요");
		String s2 = new String("안녕하세요");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		Object o1 = new Book4("자바 알고리즘", "엘컴퓨터학원", 7);
		System.out.println(o1 instanceof Book4);
	}

}

class Book3 {
	private String title;
	private String author;
	private int edition;
	
	public Book3(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	@Override
	public String toString() {
		return "Book3 [title=" + title + ", author=" + author + ", edition=" + edition+ "]";
	}
}

class Book4 {
	private String title;
	private String author;
	private int edition;
	
	public Book4(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Book4))
			return false;
		Book4 book = (Book4)obj;
		
		return title.equals(book.title) && author.equals(book.author) && edition == book.edition;
	}
	
	@Override
	public String toString() {
		return "Book4 [title=" + title + ", author=" + author + ", edition=" + edition +"]";
	}
}