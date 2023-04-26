package ch1101;

public class Ex01AnonymousClass {

	//익명클래스
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("자바 익명클래스란");
		b1.setAuthor("엘컴퓨터학원");
		
		PrintService ps = new PrintServiceForPrinter();
		b1.printInfo(ps);
		
		b1.printInfo(new PrintService() {
			
			@Override
			public void print() {
				System.out.println("- Fax로 전송 - ");
				System.out.println(b1.getTitle() + "," + b1.getAuthor());
				System.out.println();
			}
		});
		
		b1.printInfo(new PrintService(){
			
			@Override
			public void print() {
				System.out.println("- 앱 알림으로 전송 - ");
				System.out.println(b1.getTitle() + "," + b1.getAuthor());
				System.out.println();
			}
		});
		
		Book b2 = new Book();
		b2.createBook(new Device() {
			
			@Override
			public void create() {
				System.out.println("이북 생성");
			}
		});
		
		Book b3 = new Book();
		b3.createBook(new Device() {
			
			@Override
			public void create() {
				System.out.println("종이책 생성");
			}
		});
	}
}

interface PrintService {
	public abstract void print();
	default public void print(Book book) {
		
	}
}


interface Device {
	public abstract void create();
}
class PrintServiceForPrinter implements PrintService {
	
	@Override
	public void print() {
		System.out.println("- 프린터로 출력 - ");
		System.out.println();
		System.out.println("책 인스턴스가 필요합니다.");
		System.out.println();
	}
}

class Book {
	String title;
	String author;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printInfo(PrintService ps) {
		ps.print();
	}
	
	public void createBook(Device dv) {
		dv.create();
	}
	
}