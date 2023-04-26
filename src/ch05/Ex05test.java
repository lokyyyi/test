package ch05;

import java.util.Scanner;

public class Ex05test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int season;
		
		System.out.printf("월을 입력하세요%n");
		
		season = scan.nextInt();
		
		String name = "";
		
		switch (season) {
			case 3:
			case 4:
			case 5:
				name = "봄";
				break;
			case 6:
			case 7:
			case 8:
				name = "여름";
				break;
			case 9:
			case 10:
			case 11:
				name = "가을";
				break;
			case 1:
			case 2:
			case 12:
				name = "겨울";
				break;
			default:
				name = "잘 못 입력하였습니다";
		}
		System.out.printf("%s", name);
		
		
	}
	
}
/*
switch에 중첩if가능한지
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요. 
*/