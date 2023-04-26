package ch02;

public class Ex01PrimitivedataTypetest {

	public static void main(String[] args) {
		float f = 3.14f;
		System.out.printf("%1.2f%n", f);
		
		double d = 7.77;
		System.out.printf("%1.2f%n", d);
		
		byte c = 5;
		System.out.printf("%d%n", c);
								
		boolean b = true;
		System.out.printf("boolean b 참 = %b%n", b);
		b = false;
		System.out.printf("boolean b 거짓 = %b%n", b);
		
		System.out.printf("5는 5와 같은가? = %b%n", 5 == 5);
		System.out.printf("5는 5와 다른가? = %b%n", 5 != 5);
		
	}
}
/* 
문제1.
int i = 3.14;
float f = 7.77; 
boolean b = 5;
오류가 나지 않도록 수정 후 출력하세요. 
*/ 