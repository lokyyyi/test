package ch0805;

//오버라이딩(다형성)

public class Ex05Overriding {
	
	public static void main(String[] args) {
		EBook4 eb = new EBook4();
		eb.setPrice(30000);
		eb.printPrice();
		
		eb.printAllPrice();
	}

}

class Book5{
	String title;
	String author;
	int price;
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void printPrice() {
		System.out.println("paperbook price: " + price);
	}
	
	void setPrice() {
		
	}
	
}

class EBook4 extends Book5{
	int price;
	String fontColor;
	
	void setPrice(int price) {
		super.setPrice(price + 10000);
		this.price = price;
	}
	
	@Override
	void printPrice() {
		System.out.println("ebook price: " + price);
	}
	
	void printAllPrice() {
		super.printPrice();
		printPrice();		//this.printPrice();
	}
	
	/*Override
	 * void setPrice(){
	 * 
	 * }
	 */
}
