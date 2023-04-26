package ch06;

import java.util.Scanner;

public class Ex07test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isConnected = true;
		int code = 0;
		int balance = 1000;
		int co = 500;
		int sa = 300;
		int hw = 200;
		
		while (isConnected) {
			System.out.println("구매할 음료를 선택하세요.\n (1:콜라(500원), 2:사이다(300원), 3:환타(200원) -1:거스름돈 반환):");
			code = scanner.nextInt();
			 
			
			if (code == -1) {
				System.out.printf("잔액 %d원을 반환합니다.", balance);
				isConnected = false;
			} else if (code == 1) {
				if (balance - co >= 0) {
					balance -= co;
					System.out.printf("콜라를 구매하였습니다. 남은잔액은 %d 입니다.%n", balance);
				} else 
					System.out.println("잔액이 부족합니다.");
			} else if (code == 2) {
				if (balance - sa >= 0) {
					balance -= sa;
					System.out.printf("사이다를 구매하였습니다. 남은잔액은 %d 입니다.%n", balance);
				} else
					System.out.println("잔액이 부족합니다.");
			} else if (code == 3) {
				if (balance - hw >= 0) {
					balance -= hw;
				System.out.printf("환타를 구매하였습니다. 남은잔액은 %d 입니다.%n", balance);
				} else 
					System.out.println("잔액이 부족합니다.");
			} else {
				System.out.printf("잘못된 입력입니다.%n");
			}
		}
		
	}
}

/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/