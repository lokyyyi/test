package ch03;

public class Ex04test {

	public static void main(String[]args) {
		
		int tvprice = 300;
		int balance = 1000;
		
		System.out.printf("잔액이 %d원 이므로 TV 구매 %b", balance, tvprice <= balance);
		
	}
}
//가능할때 불가능할때
/*
문제 1.
TV의 금액은 300원입니다.
잔액이 1000원일 때 TV의 구매 가능 여부를 조건식을 이용하여 출력하세요. 
*/