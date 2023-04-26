package ch03;

import java.util.Scanner;

public class Ex07test {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("값을 입력하세요%n");
		int score = scan.nextInt();;
		
		String result = score > 0 ? "양수" : (score < 0 ? "음수" : "0");
		System.out.println(result);
		
		System.out.printf("%s%n", result);	
		
		
	}
}
/*
문제 1.
삼항연산자를 사용하여 사용자로 부터 입력 받은 값이 음수인지 양수인지 0인지를 출력하는 코드를 작성하세요. 
*/ 

//한번에 세가지 가능한지