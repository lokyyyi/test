package ch1202;

import java.util.Scanner;

public class Ex02test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("0~2 제외 숫자를 입력하세요");
			int i = s.nextInt();
			
			if(i == 0 || i == 1 || i == 2) {
				i = 0;
			}
			
			System.out.println("0을 제외한 숫자를 입력하세요");
			int num = s.nextInt();
			
			System.out.println(i/num);
			System.out.println(num/i);
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}

		System.out.println("종료");
	}

}
/*
문제 1.
i에 0~2 이외의 숫자를 입력하여 예외를 발생 시키세요.
문제 2.
문자열을 입력하여 예외를 발생 시키세요.
문제 3.
num에 0을 입력하여 예외를 발생 시키세요.
문제 4.
예외가 발생되지 않도록 값을 입력한 뒤 실행하세요.
*/
