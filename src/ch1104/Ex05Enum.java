package ch1104;

public class Ex05Enum {
	
	public static void main(String[] args) {
		Book2 b1 = new Book2();
		b1.setTitle("자바 열거형");
		b1.setAutor("엘컴퓨터학원");
		b1.setPrice(30000);
		b1.setCountry(Ex04Country.KOREA);
		b1.setGenre(Ex0401Genre.ACTION);
		//System.out.println(b1);
		Book2.print(b1);
		
		/*Book2 b2 = new Book2();
		b2.setTitle("java Enum");
		b2.setAutor("lcomputerstudy");
		b2.setPrice(30000);
		b2.setCountry(Ex04Country.USA);
		Book2.print(b2);
		
		Book2 b3 = new Book2();
		b3.setTitle("java Enum");
		b3.setAutor("lcomputerstudy");
		b3.setPrice(30000);
		b3.setCountry(Ex04Country.ETC);
		b3.setGenre(Ex0401Genre.HORROR);
		Book2.print(b3);*/
	}

}

class Book2 {
	private String title;
	private String author;
	private int price;
	private Ex04Country country;
	private Ex0401Genre genre;
	
	public Ex04Country getCountry() {
		return country;
	}
	
	public void setCountry(Ex04Country country) {
		this.country = country;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return (int)(price * country.getRefundTax());
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAutor(String author) {
		this.author = author;
	}
	
	public void setGenre(Ex0401Genre genre) {
		this.genre = genre;
	}
	
	public String getString() {
		return genre.getString();
	}
	public static void print(Book2 book) {
		System.out.println("제목: " + book.getTitle());
		System.out.println("저자: " + book.getAuthor());
		System.out.println("가격: " + book.getPrice());
		System.out.println("장르: " + book.getString());
		System.out.println();
	}

	@Override
	public String toString() {
		return "Book2 [title=" + title + ", author=" + author + ", price=" + price + ", country=" + country + ", genre="
				+ genre + "]";
	}
}