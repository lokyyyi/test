package ch0809;

public class Ex09Final {
	
	public static void main(String[] args) {
		Book7 b1 = new Book7();
		System.out.println(b1.tax);
		//b1.tax = 1.2f;
	}

}
class Book7{
	String title;
	String author;
	int price;
	final float tax;
	//final float tax = 1;
	
	public Book7() {
		tax = 1.1f;
	}
}


final class EBook6 extends Book7 {
	
}


class Book8{
	String title;
	String author;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}

class EBook7 extends Book8{
	String fontColor;
	
	public void setTitle(String title){
		this.title = "[E북]" + title;
	}
	
	public String getTitle() {
		return title;
	}
	 
}