package ch0706;

public class Ex06ClassMethod {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookNo = Book.generateBookNo();
		System.out.println(b1.bookNo);
		
		System.out.println();
		
		Book b2 = new Book();
		b2.bookNo = Book.generateBookNo();
		System.out.println(b2.bookNo);
		
		b1.bookNo = Book.genBookNo(); 
		
		Book.genBookNo(b1);
		
		
	}

}
class Book{
	String title;
	int bookNo;
	
	static int generateBookNo() {
		return (int)(Math.random()*9000)+1000;
		
	}
	
	static int genBookNo() {
		int bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}
	
	static void genBookNo(Book book) {
		book.bookNo = (int)(Math.random()*9000)+1000;
	}
	 
	 
}