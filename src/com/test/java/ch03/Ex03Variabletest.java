package com.test.java.ch03;

public class Ex03Variabletest {
	
	public static void main(String[] args) {
		System.out.println("현재 잔액은 2000원 입니다.");
		System.out.println();
		
		System.out.println("TV는 300원 입니다.");
		System.out.println("TV 2대는" + (300 * 2) + "원 입니다.");
		System.out.println("TV 2대를 구매하였습니다.");
		
		System.out.println("현재 잔액은" + (2000 - (300*2)) + "원 입니다.");
		
		System.out.println();
		
		System.out.println("월급 300원이 입금되었습니다.");
		System.out.println("현재 잔액은" + (2000 - 600 + 300) + "원 입니다.");	
	}

}
