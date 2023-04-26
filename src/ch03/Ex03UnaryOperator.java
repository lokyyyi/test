package ch03;

//단항연산자
public class Ex03UnaryOperator {

	public static void main(String[]args) {
		int a = 3;
		System.out.printf("a = %d%n", a++);	// a = a+1;
		System.out.printf("a = %d%n", a);
		System.out.printf("a = %d%n%n", ++a);
		
		a = 3;
		int b = a++;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a = 3;
		b = ++a;
		System.out.printf("b = %d, a = %d%n%n", b, a);
		
		a= 4;
		System.out.printf("a = %d%n%n", --a);
		
	}

}
