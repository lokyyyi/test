package ch06;

import java.util.Scanner;

public class Ex06Wtest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇단을 출력할까요?");
		int num = scanner.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("%d x %d = %d%n", num, i, num*i);
			i++;
		}
	}

}
/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다. 
중첩 while문을 이용해 구구단을 출력하세요. 
*/