package ch03;

//단항 연산자
public class Ex02UnartOprerator {
	
	public static void main(String[]args) {
		
		int a = 5;
		int b = 3;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		
		b = -b;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		
		b= -b;
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		
	}

}
