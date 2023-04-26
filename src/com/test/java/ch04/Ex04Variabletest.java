package com.test.java.ch04;

public class Ex04Variabletest {

	public static void main(String[]args) {
		int balance = 5000;
		System.out.println("현재 잔액은" + balance + "원 입니다.");
		System.out.println();
		
		int tvprice = 500;
		int pcprice = 300;
		System.out.println("TV는" + tvprice + "원 입니다.");
		System.out.println("컴퓨터는" + pcprice + "원 입니다.");
		System.out.println("TV와 컴퓨터를 구미하였습니다.");
		
		balance = balance - tvprice - pcprice;
		System.out.println("현재 잔액은" + balance + "원 입니다.");
		
		System.out.println();
		
		int salary = 500;
		System.out.println("월급 " + salary + "원이 입금되었습니다.");
		
		balance = balance + salary;
		System.out.println("현재 잔액은" + balance + "원 입니다.");
	}
}
