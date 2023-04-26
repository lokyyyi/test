package ch1403;

import java.util.Arrays;
import java.util.Locale;

public class Ex03StringUtils {
	
	public static void main(String[] args) {
		String s1 = "엘컴퓨터학원";
		String s2 = "엘컴퓨터학원";
		System.out.println(s1.compareTo(s2));	//0
		s2 = "자바 기본문법";
		System.out.println(s1.compareTo(s2));	//음수
		s2 = "가나다라";
		System.out.println(s1.compareTo(s2));	//양수
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		System.out.println(s1.contains("컴퓨터"));		//포함
		System.out.println(s1.contains("자바"));
		System.out.println();
		s1 = "엘컴";
		s2 = "퓨터학원";
		System.out.println(s1.concat(s2));		//합치기
		System.out.println();
		
		s1 = "엘컴퓨터학원 자바 기본문법";
		s2 = "자바 기본문법 엘컴퓨터학원";
		System.out.println(s1.startsWith("엘"));		//특정문자시작
		System.out.println(s2.startsWith("엘"));
		System.out.println(s1.endsWith("원"));		//특정문자끝맺음
		System.out.println(s2.endsWith("원"));
		System.out.println();
		
		s1 = "Quit";
		System.out.println(s1.equals("quit"));		//주소
		System.out.println(s1.equalsIgnoreCase("quit"));	//대소문자구별x
		System.out.println();
		
		s1 = "안녕하세요!! 엘컴퓨터!!학원!!입니다.!!!";
		System.out.println(s1);
		System.out.println(s1.replace("!",""));		//문자열치환(문자만가능한지)
		System.out.println();
		
		s1 = "안녕하세요12 엘컴퓨터34학원56입니다.7890";
		System.out.println(s1);
		System.out.println(s1.replaceAll("[0-9]", ""));		//정규표현식	
		System.out.println();
		
		s1 = "자바 기본문법";
		int i = 75300000;
		double pi = 3.14159265359;
		System.out.println(String.format("%20s", s1));		//문자열형식	
		System.out.println(String.format("%,d", i));		//10진수
		System.out.println(String.format("%#6.3f", pi));	//실수형
		System.out.println(String.format("%06.3f", pi));	//??
		System.out.println();
		
		s1 = "ABCDEfghiJKlmN";
		System.out.println(s1.toLowerCase());	//소문자변환	
		System.out.println(s1.toUpperCase());	//대문자변환
		System.out.println();
		
		s1 = "  A BC def GH I   ";
		System.out.println("[" + s1.trim() + "]");	//앞뒤공백제거
		System.out.println();
		
		s1 = "자바 기본문법 엘컴퓨터학원알고리즘";
		System.out.println(s1.substring(8));		//문자열자르기
		System.out.println(s1.substring(8, 14));
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		char[] chArr = s1.toCharArray();
		for(int j=0; j<chArr.length; j++) {
			System.out.println(chArr[j]);
		}
		System.out.println();
		
		s1 = "자바  기본   문법  엘 컴퓨터 학원 ";
		String[] strArr1 = s1.split(" +");
		System.out.println(Arrays.toString(strArr1));
		strArr1 = s1.split(" +", 3);
		System.out.println(Arrays.toString(strArr1));
		System.out.println();
		
		s1 = "asdfasdf";
		System.out.println(s1.matches("[a-z]"));
		System.out.println(s1.matches("[a-z]+"));
		s1 = "12341234";
		System.out.println(s1.matches("[0-9]+"));
		s1 = "1234zz234";
		System.out.println(s1.matches("[0-9]+"));
		System.out.println();
		
		String[] strArr2 = {"자바", "기본문법", "엘컴퓨터", "학원"};
		System.out.println(String.join(",", strArr2));
		System.out.println();
	}

}
