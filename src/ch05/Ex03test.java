package ch05;

import java.util.Scanner;

public class Ex03test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int season;
		System.out.printf("해당월을 입력하세요");
		season = scan.nextInt();
		
		String name = "계절";
		
		if (season >= 3 && season <= 5) {
			name = "봄";		
		} else if (season >= 6 && season <= 8) {
			name = "여름";
		} else if (season > 9 && season <= 11) {
			name = "가을";
		} else if (season == 12 || (season >= 1 && season <= 2) ) {
			name = "겨울";
		} else { 
			name = "잘 못 입력하였습니다";
		}
		
		System.out.printf("%s", name);
	}		
}
	
/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 작성하세요.  
*/