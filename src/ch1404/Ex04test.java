package ch1404;

public class Ex04test {
	
	public static void main(String[] args) {
		String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
		char[] chArr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<chArr.length; i++) {
			sb.append(chArr[i]);
		}
		System.out.println(sb);
		
	}

}
/*
문제 1.
String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
위 문자열을 char[] 타입으로 변환하세요.
StringBuffer를 이용해 문자열로 만들어 출력하세요. 
*/