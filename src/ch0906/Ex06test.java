package ch0906;

public class Ex06test {
	
	public static void main(String[] args) {
		Food fd = new Food();
		fd.setTitle("초코파이");
		fd.setPrice(1000);
		fd.setIn("23.1.27");
		fd.setOut("23.2.20");
		
		NonFood nf = new NonFood();
		nf.setTitle("의자");
		nf.setPrice(50000);
		nf.setIn("23.1.15");
		nf.setOut("23.2.1");
		
		Storage st = new Storage();
		st.add(fd);
		st.add(nf);
		
		Info info = new Info();
		info.info(st);
		
		Vegatable vg = new Vegatable();
		vg.title = "배추";
		vg.price = 3000;
		vg.in = "23.2.1";
		vg.out = "23.2.15";
		
		st.add(vg);
		
		info.info(st);
	}

}

class Storage {
	Inventory[] items;
	int index;
	
	public Storage() {
		items = new Inventory[10];
		index = 0;
	}
	
	public void add(Inventory item) {
		items[index] = item;
		index++;
	}
	
	public Inventory[] get() {
		return items;
	}
}
interface Inventory {
	public abstract String getTitle();
	public abstract int getPrice();
	public abstract String getIn();
	public abstract String getOut();
}

class Food implements Inventory {
	String title;
	int price;
	String in;
	String out;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return "[식품]" + title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setIn(String in) {
		this.in = in;
	}
	public String getIn() {
		return in;
	}
	
	public void setOut(String out) {
		this.out = out;
	}
	public String getOut() {
		return out;
	}
}

class NonFood extends Food implements Inventory {
	
	public String getTitle() {
		return "[비식품]" + title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getIn() {
		return in;
	}
	
	public String getOut() {
		return out;
	}
}

class Info {
	public void info(Storage storage) {
		Inventory[] items = storage.get();
		for (int i=0; i<items.length; i++) {
			if(items[i] == null)
				break;
		System.out.println("상품명: " + items[i].getTitle() + "\n가격: " + items[i].getPrice() + "\n입고일자: " + items[i].getIn() + "\n출고일자: " + items[i].getOut() + "\n");
		}
	}
}

class Vegatable implements Inventory {
	
	String title;
	int price;
	String in;
	String out;
	
	public String getTitle() {
		return "[야채]" + title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getIn() {
		return in;
	}
	
	public String getOut() {
		return out;
	}
}

/*
문제 1.
상품들을 창고에 저장하고 창고에 저장된 상품들을 출력하세요.
창고에 저장될 재고의 정보는 상품명, 가격, 입고일자(String), 출고일자(String) 입니다.
모든 상품이 재고 정보를 가지고 있지 않고 재고 인터페이스를 구현한 상품은 재고 정보를 가지고 있습니다.
재고 인터페이스를 구현한 상품만 창고에 저장이 가능하도록 구현하세요. 
힌트) 창고 클래스, 재고 인터페이스, 재고 인터페이스가 적용된 상품 클래스들, 재고들이 저장될 배열 등이 필요합니다.  
*/