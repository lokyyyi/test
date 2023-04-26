package ch07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리 프로그램");
		boolean a = true;
		//Book1 book = null;
		int bookCount = 0;
		Book1[] arrBook = new Book1[10];
		
		while (a) {
			
			System.out.println("메뉴");
			System.out.println("1.등록, 2.목록, 3.종료");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			switch (menu) {
			
				case 1:
					Book1 book = new Book1();
					System.out.println("책의 제목을 입력하세요.");
					book.title = scanner.nextLine();
					System.out.println("책의 저자를 입력하세요.");
					book.author	= scanner.nextLine();
					System.out.println("책의 가격을 입력하세요.");
					book.price = scanner.nextInt();
					
					arrBook[bookCount] = book;
					bookCount++;
					
					break;
					
				case 2 :
					System.out.println("책의 목록을 확인합니다.");
					
					for (int i=0; i <=arrBook.length; i++) {
						if (arrBook[i] == null)
							break;
						System.out.printf("제목: %-5s 저자: %-5s, 가격: %-5d%n",arrBook[i].title, arrBook[i].author, arrBook[i].price);
					}
					break;
				case 3:
					
					System.out.println("시스템이 종료됩니다.");
					a = false;
					break;
			}
			
		}
	}		
}

class Book1{
	String title;
	String author;
	int price;
}
/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/