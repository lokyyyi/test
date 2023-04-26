package ch0708;

public class Ex08test {
	
	public static void main(String[] args) {
		Book1 book = new Book1();
		book.carInfo("소나타");
		System.out.println(book.car());
		
		book.carInfo("소나타", 3000);
		System.out.println(book.car());
		
		book.carInfo("소나타", 3000, "현대");
		System.out.println(book.car());
		
	}

}

class Book1{
	String carName;
	int speed;
	String carCo;
	
	void carInfo(String carName) {
		this.carName = carName;
	}
	
	void carInfo(String carName, int speed) {
		this.carName = carName;
		this.speed = speed;
	}
	
	void carInfo(String carName, int speed, String carCo) {
		this.carName = carName;
		this.speed = speed;
		this.carCo = carCo;
	}
	
	String car() {
		return carName + "\n" + speed + "\n" + carCo + "\n"; 
		
	}
	
}
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.
문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/