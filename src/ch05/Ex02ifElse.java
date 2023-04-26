package ch05;
//if else문
public class Ex02ifElse {

	public static void main(String[]args) {
		int level = 3;
		String name = "익명";
		
		if(level >= 9) {
			name = "관리자";
		} else {
			name = "방문자";
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
		
		if (level >= 9 )
			name = "관리자";
		else
			name = "방문자";
		
			
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
	}
}
