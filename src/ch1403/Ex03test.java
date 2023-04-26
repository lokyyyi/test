package ch1403;

import java.util.Locale;
import java.util.Arrays;

public class Ex03test {
	
	public static void main(String[] args) {
		String s1 = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		System.out.println(s1.substring(18));
		System.out.println();
		
		String[] strArr1 = s1.split(" ");
		
		/*for (int i=strArr1.length-1; i>=0; i--) {
			System.out.print(strArr1[i]);
		}*/
		
		int count = 1;
		while(true) {
			if((strArr1.length - count) >= 0) {
				System.out.println(strArr1[strArr1.length - count]);
				count++;
			}
			else if((strArr1.length - count) < 0)
				break;
		}
		String s2 = "동해물";
		String s3 = "백두산";
		System.out.println();
		if((s2.compareTo(s3)>0))
				System.out.println(s2);
		else
			System.out.println(s3);
		
		

	}
}	
/*
문제 1.
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세
위 문장에서 substring 을 사용하여 "하느님이" 부터 끝까지 출력하세요.
문제 2.
위 문장을 split을 사용하여 공백을 기준으로 배열로 만든 뒤 
배열의 맨 뒤에서 앞으로 요소들을 출력하세요.
문제 3.
동해물
백두산
두 문자열 중 더 큰 문자열을 출력하세요.
힌트) compareTo를 사용하세요.
*/