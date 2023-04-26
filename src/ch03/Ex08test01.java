package ch03;

import java.util.Scanner;

public class Ex08test01 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("현재 잔고를 입력하세요%n");
		int balance = scan.nextInt();
		
		System.out.printf("사탕의 가격을 입력하세요%n");
		int price = scan.nextInt();
		
		balance -= price;
		
		System.out.printf("잔고는 %d원 입니다.", balance);
		
								
	}
}
