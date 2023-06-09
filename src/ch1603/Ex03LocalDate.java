package ch1603;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;
import javax.print.attribute.standard.JobHoldUntil;

import static java.time.temporal.ChronoUnit.YEARS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.SECONDS;
import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.NANOS;

public class Ex03LocalDate {
	
	public static void main(String[] args) {
		//LocalDate (년, 월, 일)
		System.out.println("java.time.LocalDate");
		LocalDate date1 = LocalDate.of(2020, 5, 6);
		LocalDate date2 = LocalDate.now();
		System.out.println(date1.toString());
		System.out.println(date2);
		System.out.println();
		
		System.out.println("long java.time.temporal.ChronoUnit.between(Temporal t1, Temporal t2)");
		System.out.println(ChronoUnit.YEARS.between(date1, date2));
		System.out.println(MONTHS.between(date1, date2));
		System.out.println(DAYS.between(date1, date2));
		System.out.println();
		
		System.out.println("long java.time.LocalDate.until(Temporal t, TemporalUnit u)");
		System.out.println(date1.until(date2, YEARS));
		System.out.println(date1.until(date2, MONTHS));
		System.out.println(date1.until(date2, DAYS));
		System.out.println();
		
		System.out.println("Period java.time.LocalDate.until(ChronoLocalDate d)");
		Period p = date1.until(date2);
		System.out.println(p.getYears() + "년" + p.getMonths() + "개월" + p.getDays() + "일");
		System.out.println();
		
		System.out.println("Period java.time.Period.between(LocalDate d1, LocalDate d2)");
		Period p2 = Period.between(date1, date2);
		System.out.println(p2.getYears() + "년" + p2.getMonths() + "개월" + p2.getDays() + "일");
		System.out.println();
		
		System.out.println(date1.plus(Period.of(1, 3, 5)));
		System.out.println(date1.minus(Period.ofMonths(5)));
		System.out.println();
		
		//LocalDateTime(년, 월, 일, 시, 분, 초)
		System.out.println("java.time.LocalDateTime");
		LocalDateTime datetime1 = LocalDateTime.of(2021, 8, 7, 19, 55, 22);
		LocalDateTime datetime2 = LocalDateTime.now();
		System.out.println(datetime1);
		System.out.println(datetime2);
		System.out.println();
		
		System.out.println("long java.time.temporal.ChronoUnit.between(Temporal t1, temporal t2");
		System.out.println(YEARS.between(datetime1, datetime2));
		System.out.println(MONTHS.between(datetime1, datetime2));
		System.out.println(DAYS.between(datetime1, datetime2));
		System.out.println(HOURS.between(datetime1, datetime2));
		System.out.println(MINUTES.between(datetime1, datetime2));
		System.out.println();
		
		System.out.println("long java.time.LocalDateTime.until(Temporal t, TemporalUnit u");
		System.out.println(datetime1.until(datetime2, YEARS));
		System.out.println(datetime1.until(datetime2, MONTHS));
		System.out.println(datetime1.until(datetime2, DAYS));
		System.out.println(datetime1.until(datetime2, HOURS));
		System.out.println(datetime1.until(datetime2, MINUTES));
		System.out.println();
		
		System.out.println(datetime1.plusYears(1));
		System.out.println(datetime1.minusDays(2));
		System.out.println(datetime1.withYear(2019));
		System.out.println(datetime1.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(datetime1.with(TemporalAdjusters.lastDayOfMonth()));
		LocalDateTime datetime3 = datetime1.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println(datetime3.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
		System.out.println();
		
		//LocalTime (시, 분, 초)
		System.out.println("java.time.LocalTime");
		LocalTime time1 = LocalTime.of(1, 10, 20);
		LocalTime time2 = LocalTime.of(2, 11, 50, 999123456);
		LocalTime time3 = LocalTime.now();
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println();
		
		System.out.println("long java.time.temporal.ChronoUnit.between(Temporal t1, Temporal t2)");
		System.out.println(HOURS.between(time1, time2));
		System.out.println(MINUTES.between(time1, time2));
		System.out.println(SECONDS.between(time1, time2));
		System.out.println(MILLIS.between(time1, time2));
		System.out.println(NANOS.between(time1, time2));
		System.out.println();
		
		System.out.println("long java.time.LocalTime.until(Temporal t1, TemporalUnit t2)");
		System.out.println(time1.until(time2, HOURS));
		System.out.println(time1.until(time2, MINUTES));
		System.out.println(time1.until(time2, SECONDS));
		System.out.println(time1.until(time2, MILLIS));
		System.out.println(time1.until(time2, NANOS));
		System.out.println();
		
		System.out.println("Duration java.time.Duration.between(Temporal t1, Temporal t2)");
		Duration d = Duration.between(time1, time2);
		System.out.println(d.getSeconds());
		System.out.println(d.getNano());
		System.out.println();
		
		
		Duration d2 = Duration.of(55, SECONDS);
		System.out.println(time1.minus(d2));
		System.out.println(time1.plus(30, SECONDS));
		System.out.println();
		
		System.out.println("DateTimeFormatter");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(datetime1.format(df));
		System.out.println(datetime2.format(df));
		System.out.println();
		
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
		Scanner s = new Scanner(System.in);
		System.out.println("yyyy년MM월dd일 패턴으로 날짜를 입력해 주세요: ");
		String inputDate = s.nextLine();
		
		LocalDate date3 = LocalDate.parse(inputDate, df2);
		LocalDateTime datetime4 = date3.atStartOfDay();
		System.out.println(datetime4);
		datetime4 = date3.atTime(1, 15, 55);
		System.out.println(datetime4);
		System.out.println(df.format(datetime4));
		
	}

}
