package ch1802;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Ex02test {
	
	public static void main(String[] args) {
		String[] arrMenus = {"짜장면", "짬뽕", "된장찌개", "김치찌개", "탕수육"};
		
		Guest g1 = new Guest("A");
		g1.addMenu("짜장면");
		g1.addMenu("짬뽕");
		
		Guest g2 = new Guest("B");
		g2.addMenu("짜장면");
		g2.addMenu("탕수육");
		
		Guest g3 = new Guest("C");
		g3.addMenu("짜장면");
		g3.addMenu("김치찌개");
		
		Order order = new Order();
		order.setMenus(arrMenus);
		order.setGuest(g1, g2, g3);
		
		System.out.println("주문한 모든메뉴");
		Set<String> a1 = order.getOrderMenus();
		order.print(a1);
		
		System.out.println("모두 주문한 메뉴");
		Set<String> a2 = order.getBasicMenus();
		order.print(a2);
		
		System.out.println("모두 시키지않은 메뉴");
		Set<String> a3 = order.getCancleMenus();
		order.print(a3);

	}
}
class Order {
	private Set<String> menus;
	private List<Guest> guests;
	
	public void setGuest(Guest...arrGuest) {
		guests = new ArrayList<>();
		Collections.addAll(guests, arrGuest);
	}
	
	public List<Guest> getGuest(){
		return guests;
	}
	
	public void setMenus(String[] arrMenus) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, arrMenus);
		menus = new HashSet<>(list);
	}
	
	public Set<String> getMenus(){
		return menus;
	}
	
	public Set<String> getOrderMenus(){
		Set<String> oMenus = new HashSet<>();
		for (Guest guest : guests) {
			oMenus.addAll(guest.getMenus());
		}
		return oMenus;
	}
	
	public Set<String> getBasicMenus(){
		Set<String> menus = null;
		for (Guest guest : guests) {
			if(menus == null)
				menus = new HashSet<>(guest.getMenus());
			menus.retainAll(guest.getMenus());
		}
		
		return menus;
	}
	
	public Set<String> getCancleMenus(){
		Set<String> allMenus = new HashSet<>(menus);
		Set<String> oMenus = getOrderMenus();
		
		allMenus.remove(oMenus);
		
		return allMenus;
	}
	
	public static void print(Collection<String> menus) {
		for (String menu : menus) {
			System.out.print(menu + ", ");
		}
		System.out.println("\n");
}
}
class Guest {
	private String name;
	private Set<String> menus;
	
	public Guest(String name) {
		this.name = name;
		menus = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addMenu(String menu) {
		menus.add(menu);
	}
	
	public Set<String> getMenus() {
		return menus;
	}
}

/*
엘컴퓨터식당에는 짜장면, 짬뽕, 된장찌개, 김치찌개, 탕수육 식사 메뉴가 있습니다.
A는 짜장면, 짬뽕을 시켰습니다.
B는 짜장면, 탕수육을 시켰습니다.
C는 짜장면, 김치찌개를 시켰습니다. 
문제 1.
주문한 모든 메뉴를 중복 없이 정렬하여 출력하세요.
문제 2.
모든 사람이 주문한 메뉴를 출력하세요.
문제 3.
한 명도 시키지 않은 메뉴들을 출력하세요.
*/