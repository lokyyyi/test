package ch03;

public class Ex08test {

	public static void main(String[]args) {
		int sum = 500;
		System.out.println("현재 잔고는" + sum +"원 입니다.\n");
		int dool = 100;
		
		sum -= dool;
		
		System.out.printf("현재 잔고는 %d 원입니다.", sum);
		
	}
}
/*
문제 1.
둘리의 통장에 잔고는 500원입니다.
둘리가 100원 짜리 사탕을 구매한 뒤 잔고를 할당 연산자를 사용하여 작성하고 잔고를 출력하세요. 
*/