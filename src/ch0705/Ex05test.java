package ch0705;

public class Ex05test {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		Book.cate = "문화";
		b1.cateInfo();
		b2.cateInfo();
		System.out.println();
		
		Book.cate = "도서";
		b1.cateInfo();
		b2.cateInfo();
		
		
		
	}
	

}
class Book{
	static String cate;
	
	void cateInfo() {
		System.out.println(cate);
	}
}
/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/