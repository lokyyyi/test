package ch0703;

import java.util.Scanner;

public class Ex03test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cal1 num = new Cal1();
		System.out.println("a값");
		num.a = scanner.nextInt();
		System.out.println("b값");
		num.b = scanner.nextInt();
		
		num.plus();
		num.minus();
		num.multip();
		num.division();	
	}

}

class Cal1 {
	int a;
	int b;
	
	void plus() {
		System.out.println(a + b);
	}
	
	void minus() {
		System.out.println(a - b);
	}
	
	void multip() {
		System.out.println(a * b);
	}
	
	void division() {
		System.out.println((float)a / (float)b);
	}
	
}




/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/