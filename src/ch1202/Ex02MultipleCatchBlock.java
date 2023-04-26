package ch1202;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 캐치 블록
public class Ex02MultipleCatchBlock {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {3, 5, 7};
		
		try {
			System.out.println("0~2 숫자를 입력하세요: ");
			int i = scanner.nextInt();
			
			System.out.println("0 이외의 숫자를 입력하세요: ");
			int num = scanner.nextInt();
			
			System.out.println(arr[i] / num);
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
			
		} catch (ArithmeticException e) {
			System.out.println("산술 예외가 발생되었습니다.");
			
		} catch (Exception e) {
			System.out.println("예외발생!!!");
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 종료 됩니다.");
	}

}
