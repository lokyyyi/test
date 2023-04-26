package ch05;

import java.util.Scanner;

public class Ex02test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int level;
		System.out.printf("레벨을 입력하세요%n%n");
		level = scan.nextInt();
		
		String name = "익명";
		
		if (level > 3)
			name = "정회원";
		else
			name = "회원";
		
		System.out.println();
		
		System.out.printf("%s님 안녕하세요", name);
				
	}
}
/*
문제 1.
사용자에게 입력 받은 레벨이 3 보다 크다면 "정회원님 안녕하세요."를 출력하고
3보다 작다면 "회원님 안녕하세요."를 출력하는 코드를 작성하세요. 

*string int 차이 숫자 문자
*
*/