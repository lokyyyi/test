package ch1602;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02test {
	
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		
		Scanner scan = new Scanner(System.in);
		Date inputDate = null;
		System.out.println("yyyy년MM월dd일 입력");
		String strDate = scan.nextLine();
		try {
			inputDate = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(sdf1.format(inputDate));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.add(Calendar.MONTH, 1);
		Date inputDate2 = cal.getTime();
		System.out.println(sdf1.format(inputDate2));
	}

}
/*
문제1.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd 패턴으로 출력하세요.
*/