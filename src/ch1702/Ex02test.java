package ch1702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02test {
	
	public static void main(String[] args) {
		Pencil p1 = new Pencil("검정", 1);
		Pencil p2 = new Pencil("파랑", 2);
		
		Tv t1 = new Tv("삼성", 20);
		Tv t2 = new Tv("엘지", 30);
		
		Box<Pencil> Bp = new Box<Pencil>();
		Bp.add(p1);
		Bp.add(p2);
		
		Bp.printAllItems();
		System.out.println();
		
		Box<Tv> Bt = new Box<Tv>();
		Bt.add(t1);
		Bt.add(t2);
		
		Bt.printAllItems();
	}

}
class Pencil {
	private String color;
	private int size;
	
	public Pencil(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Pencil [color=" + color + ", size=" + size + "]";
	}
}

class Tv {
	private String brand;
	private int inch;
	
	public Tv(String brand, int inch) {
		this.brand = brand;
		this.inch = inch;
	}
	
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", inch=" + inch + "]";
	}
}

class Box<T> {
	private List<T> items;
	
	public Box() {
		items = new ArrayList<T>();
	}
	
	public void add(T item) {
		items.add(item);
	}
	
	public void printAllItems() {
		for (T item : items) {
			System.out.println(item);
		}
	}
}

/*
문제 1.
상자에 연필과 티비를 담는 프로그램을 코딩하세요.
상자에는 연필, 티비 외에 어떠한 타입도 받을 수 있도록 타입 파라미터를 사용하세요. 
*/