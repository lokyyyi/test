package ch1701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex01test {
	
	public static void main(String[] args) {
		Book1 b0 = new Book1("0", "엘컴퓨터학원");
		Book1 b1 = new Book1("1", "엘컴퓨터학원1");
		Book1 b2 = new Book1("2", "엘컴퓨터학원");
		Book1 b3 = new Book1("3", "엘컴퓨터학원3");
		Book1 b4 = new Book1("4", "엘컴퓨터학원");
		Book1 b5 = new Book1("5", "엘컴퓨터학원5");
		Book1 b6 = new Book1("6", "엘컴퓨터학원");
		Book1 b7 = new Book1("7", "엘컴퓨터학원7");
		Book1 b8 = new Book1("8", "엘컴퓨터학원");
		Book1 b9 = new Book1("9", "엘컴퓨터학원9");
		
		Book1[] bookArr = {
				new Book1("0", "엘컴퓨터학원"),
				new Book1("1", "엘컴퓨터학원1"),
				new Book1("2", "엘컴퓨터학원"),
				new Book1("3", "엘컴퓨터학원3"),
				new Book1("4", "엘컴퓨터학원"),
				new Book1("5", "엘컴퓨터학원5"),
				new Book1("6", "엘컴퓨터학원"),
				new Book1("7", "엘컴퓨터학원7"),
				new Book1("8", "엘컴퓨터학원"),
				new Book1("9", "엘컴퓨터학원9")
		};
		List<Book1> tmpList = Arrays.asList(bookArr);	// 수정 불가 (싱글톤)
		
		List<Book1> bookList = new ArrayList<Book1>(tmpList);
		bookList.add(new Book1("10", "엘컴퓨터학원10"));
		
		for (Book1 b : bookList) {
			System.out.println("---" + b);
		}
		System.out.println();
		
		
		Cart1 cart = new Cart1();
		cart.add(b0);
		cart.add(b1);
		cart.add(b2);
		cart.add(b3);
		cart.add(b4);
		cart.add(b5);
		cart.add(b6);
		cart.add(b7);
		cart.add(b8);
		cart.add(b9);
	
		List<Book1> books = cart.getAllBooks();
		
		Cart1.ForEach(books);
		
		System.out.println();
		
		Cart1.removeIterator(books);
		
	}

}

class Book1 {
	private String title;
	private String author;
	
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

class Cart1 {
	private List<Book1> books;
	
	public Cart1() {
		books = new ArrayList<Book1>();
	}
	
	public void add(Book1 book) {
		books.add(book);
	}
	
	public List<Book1> getAllBooks(){
		return books;
	}
	
	public static void ForEach(List<Book1> books) {
		for(Book1 book : books) {
			System.out.println(book);
		}
	}
	
	public static void removeIterator(List<Book1> books) {
		for (Iterator<Book1> it = books.iterator(); it.hasNext(); ) {
			Book1 book = it.next();
			if(book.getAuthor().equals("엘컴퓨터학원")) 
				it.remove();
		}
		System.out.println(books.toString());
	}
	
	
}
/*
문제 1.
Book 타입 인스턴스 10개를 생성하여 배열에 저장합니다.
배열을 ArrayList로 변경합니다.
foreach 문을 사용하여 리스트에 저장된 모든 책들을 출력합니다.
Book의 저자가 엘컴퓨터학원인 것을 제외한 나머지 책은 모두 삭제합니다.
리스트에 남아 있는 책들을 출력합니다.
힌트) 삭제 시 foreach문은 예외가 발생될 수 있습니다.
*/