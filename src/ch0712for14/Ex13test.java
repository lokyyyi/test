package ch0712for14;

import java.util.Scanner;

public class Ex13test {
	
	public static void main(String[] args) {
		Ex12Book book = new Ex12Book();
		
		book.price = 1000;
		
		System.out.println(book.price);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가격을입력하세요");
		int price = scanner.nextInt();
		book.price = Ex12Book.priceSet(price);
		
		System.out.println(book.price);
		
		
		
		Ex12Book book1 = new Ex12Book();
		
		book1.price = 20000;
		
		System.out.println(book1.price);
		
		Ex12Book book3 = new Ex12Book();
		System.out.println("가격을 입력하세요");
		book3.price = scanner.nextInt();
		
		Ex12Book.priceSet(book3);
		
		System.out.println(book3.price);
		
	}

}
/*
문제 1.
call by value 를 이용해 책의 금액을 수정하는 메소드를 작성하세요.
힌트) 수정된 금액을 return 하세요. 
*//*
문제 1.
call by reference 를 이용해 책의 금액을 수정하는 메소드를 코딩하세요. 
*/