package com.test.java.ch07;

import java.util.Scanner;

public class Ex07Scannertest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance;
		int cs;
		int yh;
		int dl;
		
		System.out.printf("사탕 재고를 입력하세요.%n");
		balance = scan.nextInt();
		System.out.printf("철수가 사탕을 산 갯수를 입력하세요.%n");
		cs = scan.nextInt();
		System.out.printf("영희가 사탕을 산 갯수를 입력하세요.%n");
		yh = scan.nextInt();
		System.out.printf("둘리가 사탕을 환불한 갯수를 입력하세요.%n");
		dl = scan.nextInt();
		
		System.out.printf("슈퍼에는 %d개의 사탕이 있습니다%n", balance);
		System.out.printf("철수는 %d개의 사탕을 사고 영희는 %d개의 사탕을 샀습니다.%n", cs, yh);
		System.out.printf("둘리는 예전에 사두었던 사탕 %d개를 환불했습니다.%n", dl);
		
		balance = balance - cs - yh + dl;
		
		System.out.printf("슈퍼에 남아 있는 사탕의 재고는 %d개 입니다.", balance);
		
	}


}

/* 
문제 1. 슈퍼에는 10개의 사탕이 있습니다. 
철수는 3개의 사탕을 사고 영희는 2개의 사탕을 샀습니다.
둘리는 예전에 사두었던 사탕 2개를 환불했습니다.
슈퍼에 남아 있는 사탕의 재고는 7개입니다.
위 내용을 scanner를 사용하여 작성하세요.
 
*/ 
