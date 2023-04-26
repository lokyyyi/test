package com.test.java.ch06;

public class Ex06Printftest {

	public static void main(String[] args) {
		int balance = 10;
		System.out.printf("슈퍼에는 %d개의 사탕이 있습니다. %n%n", balance);
		
		int cs = 3;
		int yh = 2;
		int dl = 2;
		System.out.printf("철수는 %d개의 사탕을 사고 영희는 %d개의 사탕을 샀습니다. %n", cs, yh);
		System.out.printf("둘리는 예전에 사두었던 사탕 %d개를 환불했습니다. %n", dl);
		
		balance = balance - cs - yh + dl;
		
		System.out.printf("슈퍼에 남아 있는 사탕의 재고는 %d개입니다.", balance);
		
				
				
	}
}
/*
문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 코드로 작성하세요. 
*/