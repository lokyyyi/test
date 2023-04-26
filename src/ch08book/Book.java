package ch08book;

public class Book {
	public String title;
	private String author;
	protected int price;
	private int dollarPrice;
	protected int edition;
	protected float tax;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
		setDollarPrice(price);
	}
	
	public int getPrice(){
		return price;
	}
	
	protected void setDollarPrice(int price) {
		dollarPrice = (int)(price / 1000f);
	}
	
	public int getDollarPrice() {
		return dollarPrice;
	}
	
	protected void setTax(float tax) {
		this.tax = tax;
	}
	
	protected float getTax() {
		return tax;
	}

}
