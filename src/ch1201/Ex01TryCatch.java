package ch1201;

import java.util.Scanner;

//예외처리
public class Ex01TryCatch {
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("문자열을 입력해 예외를 발생시키세요:");
			int num = scanner.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("숫자만 입력 가능 합니다.");
			
			//e.printStackTrace();
		}
		
		System.out.println("프로그램이 종료 됩니다.");
	}

}
