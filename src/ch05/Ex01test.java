package ch05;

public class Ex01test {

	public static void main(String[]args) {
		int level = 1;
		String name = "익명";
		
		level = 5;
		if(level >= 5)
			name = "vip";
		System.out.printf("%s회원님 안녕하세요.%n", name);					
	}
}
/*
문제 1.
로그인한 회원의 레벨이 5 이상이면 "VIP회원님 안녕하세요"를 출력하는 코드를 작성하세요. 
*/