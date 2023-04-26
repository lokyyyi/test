package ch05;

import java.util.Scanner;

public class Ex04test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int season;
		
		System.out.printf("월을 입력하세요.%n");
		
		season = scan.nextInt();
		
		String name = "";
		
		if (season >= 3 && season <= 5) {
			name = "봄";
		}else if (season >= 6 && season <= 8) {
			name = "여름";
			if (season == 8) {
				name = name + "(휴가철)";
			}
		}else if (season >= 9 && season <= 11) {
			name = "가을";
		}else if (season == 12 || (season == 1 || season ==2)){
			name = "겨울";
		}else {
			name = "잘 못 입력하였습니다.";
		}
		
		System.out.printf("%s.", name);
						
		
		
		
	}
}
