package ch03;

import java.util.Scanner;

public class Ex01ArithmeticOperatortest {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int tvprice = 0;
		int amount = 0;
		
		System.out.printf("tv의 가격을 입력하세요. %n");
		tvprice = scan.nextInt();
		System.out.printf("구매하고자 하는 tv의 수량을 입력하세요.%n");
		amount = scan.nextInt();
		
		int c = tvprice * amount;			
		
		System.out.printf("총액은 %d 원 입니다.", c);
		
	}
}
/*
문제 1.
TV의 수량과 금액을 입력 받고 총액을 출력하세요. 
 */