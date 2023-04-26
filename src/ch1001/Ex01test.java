package ch1001;

public class Ex01test {
	
	public static void main(String[] args) {
		Food fd = new Food();
		fd.title = "사과";
		fd.price = 2000;
		fd.setDate("23.1.28");
		
		fd.print(); //이너클래스 date
		
		System.out.println();
		System.out.println(fd.getDate()); //아우터클래스 date
		System.out.println();
		Food.DateCalculator date = fd.new DateCalculator();
		System.out.println(date.getDate("55.55.55")); //이너클래스 지역변수
		
	}

}

class Food {
	String title;
	int price;
	private String date;
	private String safetyDate;
	
	class DateCalculator {
		private String date;
		
		String getDate(String date) {
			return date;
		}
		void setDate() {
			String date = "기본날짜";
			this.date = Food.this.date + " 로 부터 6개월" + date;
			Food.this.safetyDate = this.date;
		}
	}

	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
		Food.DateCalculator dc = this.new DateCalculator();
		dc.setDate();
	}
	
	public void print() {
		System.out.println("상품명: " + title + "\n가격: " + price + "\n유통기한: " + safetyDate);
	}
	
}
/*
문제 1.
이너 클래스를 사용한 예제를 작성하세요.
문제 2.
아우터 클래스의 인스턴스 변수, 이너 클래스의 인스턴스 변수, 이너 크래스의 메소드내 지역 변수 모두 이름을 같게 설정하고 각각의 값을 출력하는 코드를 작성하세요.  
*/