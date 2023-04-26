package ch03;

public class Ex05test {

	public static void main(String[]args) {
		int a = 300;
		int b = 500;
		int c = 600;
		int t = 550;
		int v = 700;
		System.out.printf("TV의 가격은 %d원보다 작거나, %d원보다 크고 %d원보다 작다. (%b)%n", a, b, c, (t < a || b < t && t < c));
		System.out.printf("TV의 가격은 %d원보다 작거나, %d원보다 크고 %d원보다 작다. (%b)%n", a, b, c, (v < a || b < v || v < c));
		
	}
}
/*
문제 1.
TV의 가격이 300원 보다 작거나 500원 보다 크고 600원 보다 작은 경우 true를 반환하는 코드를 작성하고 결과를 출력하세요. 
*/