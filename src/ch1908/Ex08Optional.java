package ch1908;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;


public class Ex08Optional {

	public static void main(String[] args) {
		List<EBook> ebooks = new ArrayList<>();
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("< of(instance) >");
		EBook eb = new EBook("AWS", 40000, EBook.Category.APP);
		Optional<EBook> opt = Optional.of(eb);
		System.out.println(opt.get());
		System.out.println();
		
		System.out.println("< of(null) >");
		EBook eb2 = null;
		try {
			Optional<EBook> opt2 = Optional.of(eb2);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println();
		
		System.out.println("< ofNullable >");
		Optional<EBook> opt3 = Optional.ofNullable(eb2);
		try {
			opt3.get();
		} catch (NoSuchElementException e) {
			System.out.println("get 메소드 호출 시 " + e.getMessage());
		}
		
		System.out.println();
		
		System.out.println("< isPresent >");
		if (opt3.isPresent())
			System.out.println(opt3.get());
		else
			System.out.println("opt3는 null입니다");
		EBook eb3 = opt3.isPresent() ? opt3.get() : new EBook("옵셔널", 30000, EBook.Category.LANG);
		System.out.println(eb3);
		System.out.println();
		
		System.out.println("< orElse > ");
		EBook eb4 = opt3.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG));
		System.out.println(eb4);
		System.out.println();
		
		System.out.println("< orElseGet >");
		EBook eb5 = opt3.orElseGet(() -> new EBook("옵셔널", 30000, EBook.Category.LANG));
		System.out.println(eb5);
		System.out.println();
		
		System.out.println("< orElseTrow >");
		try {
			opt3.orElseThrow(() -> new NullPointerException());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		System.out.println();
		
		System.out.println("< empty >");
		Optional<EBook> opt4 = Optional.empty();
		Optional<EBook> opt5 = null;
		System.out.println(opt4.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG)));
		//System.out.println(opt5.orElse(new EBook("옵셔널", 30000, EBook.Category.LANG)));		//NullPointerException
		System.out.println();
		
		System.out.println("< OptionalInt >");
		OptionalInt optInt = 
				ebooks
					.stream()
					.mapToInt(EBook::getPrice)
					.max();
		System.out.println(optInt.getAsInt());
		System.out.println();
		
		System.out.println("< flatMap, map >");
		Pane1 p = new Pane1();
		p.setType("IPS");
		Optional<Pane1> pane1 = Optional.of(p);
		
		Screen s = new Screen();
		s.setPane1(pane1);
		Optional<Screen> screen = Optional.of(s);
		
		Monitor monitor = new Monitor();
		monitor.setScreen(screen);
		
		String pane1Type = 
				Optional
					.ofNullable(monitor)
					.flatMap(Monitor::getScreen)
					.flatMap(Screen::getPane1)
					.map(Pane1::getType)
					.orElse("TN");
		System.out.println(pane1Type);
		System.out.println();
		
		System.out.println("< ifPresent >");
		Optional<String> optPane1Type = 
				Optional
					.ofNullable(monitor)
					.flatMap(Monitor::getScreen)
					.flatMap(Screen::getPane1)
					.map(Pane1::getType);
		optPane1Type.ifPresent(System.out::println);
	}
}
class Monitor {
	private Optional<Screen> screen;

	public Optional<Screen> getScreen() {
		return screen;
	}

	public void setScreen(Optional<Screen> screen) {
		this.screen = screen;
	}
	
	
}

class Screen {
	private Optional<Pane1> pane1;
	
	public Optional<Pane1> getPane1(){
		return pane1;
	}
	
	public void setPane1(Optional<Pane1> pane1) {
		this.pane1 = pane1;
	}
}

class Pane1 {
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
class EBook implements Comparable<EBook> {
	
	public enum Category {
		LANG, APP
	}
	private String title;
	private int price;
	private Category category;
	
	public EBook(String title, int price, Category category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int compareTo(EBook b) {
		return title.compareTo(b.title);
	}
}
