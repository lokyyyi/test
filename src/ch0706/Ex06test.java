package ch0706;

public class Ex06test {
	
	public static void main(String[] args) {
		Book1 b1 = new Book1();
		float f = Book1.dollarIn(12600);
		System.out.println(Book1.dollarIn(12600));
		
		
	}

}
class Book1{
	
	static float dollarIn(int price) {
		float dollar = (float)price/1000;
		System.out.println(dollar);
		return dollar;
		
	}
	
	
}
/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.
문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/