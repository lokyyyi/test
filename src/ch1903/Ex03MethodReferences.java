package ch1903;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;


//메소드 참조
public class Ex03MethodReferences {
	
	public static void main(String[] args) {
		
		System.out.println("< 메서드 참조 >");
		Function<String, Integer> f1 = str -> Integer.parseInt(str);
		int i1 = f1.apply("77");
		System.out.println(i1);
		
		Function<String, Integer> f2 = Integer::parseInt;
		int i2 = f2.apply("78");
		System.out.println(i2);
		System.out.println();
		
		System.out.println("< 메서드 참조를 이용한 배열 생성 >");
		IntFunction<int[]> f3 = i -> new int[i];
		System.out.println(Arrays.toString(f3.apply(5)));
		
		IntFunction<int[]> f4 = int[]::new;
		System.out.println(Arrays.toString(f4.apply(5)));
		System.out.println();
		
		Store store = new Store();
		String[] titles = {"자바문법" , "자바컬렉션프레임워크", "람다", "스트림"};
		
		//static 메서드 호출
		// s ->new Book(s);
		store.addAll(titles, Book::new, Book::validateLength);		// s -> Book.validateLength(s);
		Collections.sort(store.getItems(), Item::compareByTitleAsc);	// (a, b) -> Item.compareByTitleAsc(a, b)
		
		System.out.println("< '인스턴스::메소드' 방식으로 인스턴스 메소드 호출 > ");
		Runnable printItems = store::forEach;	// () -> store.forEach();
		printItems.run();
		System.out.println();
		
		System.out.println("< '클래스::메소드' 방식으로 인스턴스 메소드 호출 >");
		Consumer<Store> printItems2 = Store::forEach;	// s -> s.forEach();
		printItems2.accept(store);
		System.out.println();
				
	}

}

class Store {
	private List<Item> items = new ArrayList<>();
	
	public void addAll(String[] titles, Function<String, Item> createItem, Predicate<String> validateItem) {
		for (String title : titles) {
			if (validateItem.test(title))
				items.add(createItem.apply(title));
		}
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public void forEach() {
		for (Item item : items) {
			System.out.println("[title]" + item.getTitle());
		}
	}
}

interface Item {
	public abstract String getTitle() ;
		
	public static int compareByTitleAsc(Item item1, Item item2) {
		return item1.getTitle().compareTo(item2.getTitle()); // test 입니다.
	}
}

class Book implements Item {
	public static final int TITLE_MAX_LENGTH = 5;
	private String title;
	public Book(String title) {
		this.title = title;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	public static boolean validateLength(String title) {
		return title.length() <= TITLE_MAX_LENGTH;
	}
	
	public static int compareByTitle(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
	
}