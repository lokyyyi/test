package ch0904;

//다형성
public class Ex04Polymorphism {
	
	public static void main(String[] args) {
		Product p = new Product();
		Product p2 = p;
		System.out.println(p.equalsProduct(p2));
		
		Book4 b1 = new Book4();
		b1.setTtile("자바 자료구조");
		b1.setAuthor("엘 컴퓨터학원");
		
		Book4 b2 = new Book4();
		b2.setTtile("자바 자료구조");
		b2.setAuthor("엘 컴퓨터학원");
		
		Book4 b3 = new Book4();
		b3.setTtile("자바 자료구조");
		b3.setAuthor("엘 코딩랩");
		
		System.out.println(b1.equalsProduct(b2));
		System.out.println(b1.equalsProduct(b3));
	
		//Product.testEquals(b1, b2);
		//Product.testEquals(e1, e2);
		
		//b1 = new Product();
		
		b1.setPrice(15000);
		b2.setPrice(15000);
		System.out.println(b1.compareProduct(b2));
		
		
		
	}

}

class Product {
	public boolean equalsProduct(Product p) {
		return this == p;
	}
	
	public Product compareProduct(Product p) {
		return null;
	}
	
	/*public static boolean testEquals(Product p1, Product p2) {
		return p1.equalsProduct(p2);
	}*/
	
}

/*class EBook11 extends Product {
	private String device;
}
*/
class Book4 extends Product {
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	
	public void setTtile(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// Book4 b2 = new Book4();
	// Product p = b2;
	// Product p = b3;
	@Override
	public boolean equalsProduct(Product p) {
		if (!(p instanceof Book4))
			return false;
		
		Book4 book = (Book4)p;
		boolean result = title.equals(book.title) && author.equals(book.author);
		
		return result;
	}
	
	public Product compareProduct(Product p) {
		if (!(p instanceof Book4))
			return null;
		
		Book4 book = (Book4)p;
		if (price > book.price) {
			return this;
		} else {
			return book;
		}
	}
}
/*
문제 1.
Product 클래스에 두 인스턴스간의 크기를 비교하는 메소드인 compareProduct 메소드를 추가하세요.
Book4 클래스에 compareProduct 메소드를 오버라이딩 후 가격이 높은 책의 인스턴스를 반환하도록 코딩하세요.
반환된 인스턴스의 title을 출력하세요. 
*/