package com.test.java.ch08;

public class Ex08Swaptest {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int c = 70;
		
		System.out.printf("a의 값은 %d이고 b의 값은 %d, c의 값은 %d 입니다.%n%n", a, b, c);
		
		int d = a;
		a = b;
		b = c;
		c = d;
		System.out.printf("a의 값은 %d이고 b의 값은 %d, c의 값은 %d 입니다.", a, b, c);
		
	}

}
/*
문제 1.
int a = 50;
int b = 30;
int c = 70;
swap알고리즘을 사용하여 세 변수의 값을 바꿔 주세요. 
*/
