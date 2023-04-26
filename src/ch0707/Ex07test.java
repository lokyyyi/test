package ch0707;

public class Ex07test {
	
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		
		b1.price = 2000;
		System.out.println(b1.priceIn());
	}

}
class Book1{
	float price;
	final static float tax = 1.2f;
	
	float priceIn() {
		float price = (this.price*tax);
		
		return price;
	}
	
}