package ch1601;

import java.util.Calendar;

public class Ex01test {
	
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.set(2000, 11, 1);
		c2.set(2020, 4, 6);
		
		long diffMilli = c2.getTimeInMillis() - c1.getTimeInMillis();
		long diffDay = diffMilli / (24 * 60 * 60 * 1000);
		
		System.out.println((diffDay / 365) + "년 " + (diffDay % 365) + "일");
	}

}
/*
문제 1.
2000년 12월 1일 
2020년 5월 6일 
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요. 
*/