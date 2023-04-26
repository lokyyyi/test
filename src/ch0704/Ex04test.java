package ch0704;

import java.util.Scanner;

public class Ex04test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BookT book = new BookT();
		book.insertPrice();
		
		System.out.println();
		
		BookT book1 = new BookT();
		BookT book2 = new BookT();
		
		System.out.println("금액을 입력하세요:");
		int price = scanner.nextInt();
		book1.insertPrice(price);
		
		System.out.println();
		
		book2.insertPrice();
		
		System.out.println();
		System.out.println(book.price);
		System.out.println();
		System.out.println(book1.price);
		System.out.println();
		System.out.println(book2.price);
		
		String[] arrAuthor = {"홍길동", "손흥민"};
		book.insertAuthor(arrAuthor);
		arrAuthor[1] = "둘리";
		System.out.println();
		System.out.println(book.author);
		
	}

}

class BookT{
	int price;
	String[] author;
	
	void insertPrice(int inputPrice) {
		
		/*System.out.println("가격을 입력하세요.");
		System.out.println();
		this.price = scanner.nextInt();*/
		
		if (inputPrice >= 10000 && inputPrice < 80000) {
			price = inputPrice;
			System.out.println(price + "원 설정 되었습니다.");
		} else {
			System.out.println("설정 가능하지 않은 가격입니다.");
		}
	}
	
	void insertAuthor(String[] authors) {
		//author = authors;
		for (int i=0; i<authors.length; i++) {
			author[i] = authors[i];
		}
	}
	
	void insertAuthor2() {
		Scanner scanner = new Scanner(System.in);
		int authorCount = 0;
		while (authorCount < author.length) {
			System.out.printf("저자를 입력하세요(남은횟수)");
			String tmpAuthor = scanner.nextLine();
			if (tmpAuthor.equals("q"))
				break;
			author[authorCount] = tmpAuthor;
			authorCount++;
		}
		
		
		/*
		int authorCount = 0;
		for (int i=0; i<3; i++) {
			System.out.printf("저자를 입력하세요(남은횟수 %d)", 3-i);
			this.author = scanner.nextLine();
			arr[authorCount] = this.author;
			authorCount++;		
		}*/
	}
}
/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.
문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.
문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/