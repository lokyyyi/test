package ch1603;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.YEARS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.SECONDS;
import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.NANOS;

public class Ex03test {
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2000, 12, 01);
		LocalDate d2 = LocalDate.of(2020, 05, 06);
		
		Period p = d.until(d2);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		Scanner s = new Scanner(System.in);
		System.out.println("yyyy년MM월dd일");
		String inputDate = s.nextLine();
		
		
		LocalDate date = LocalDate.parse(inputDate, df);
		date.plus(1, MONTHS);
		LocalDateTime dateTime = date.atStartOfDay();
		System.out.println(dateTime);
		System.out.println();
		System.out.println(df.format(dateTime));
		System.out.println(df1.format(dateTime));
		
	}

}
/*
문제 1.
2000년 12월 1일 
2020년 5월 6일 
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요. 
문제 2.
yyyy년MM월dd 패턴으로 입력 받아 1개월 뒤의 날짜를 yyyy/MM/dd HH:mm:ss 패턴으로 출력하세요.
*/