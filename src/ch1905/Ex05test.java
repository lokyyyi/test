package ch1905;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex05test {
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("소나타", 20000, Car.Company.HYUNDAI));
		cars.add(new Car("K5", 30000, Car.Company.KIA));
		cars.add(new Car("캐스퍼", 13000, Car.Company.HYUNDAI));
		cars.add(new Car("코란도", 35000, Car.Company.SSANGYONG));
		cars.add(new Car("제네시스", 55000, Car.Company.HYUNDAI));
		
		
		System.out.println("< 문제1 >");		//자동차 금액의 평균가를 출력하세요.
		double avgPrice = 
				cars
					.stream()
					.mapToInt(Car::getPrice)
					.average()
					.getAsDouble();
		System.out.printf("%,.0f원%n", avgPrice);
		
		System.out.println("< 문제2 >");		//가장 높은 자동차의 금액을 출력하세요.
		long maxPrice = 					//long쓰는이유
				cars
					.stream()
					.mapToInt(Car::getPrice)
					.max()
					.getAsInt();
		System.out.println(maxPrice);
		
		System.out.println("< 문제3 >");	//세금 10% 부가된 자동차 가격 총액을 출력하세요. 힌트) reduce를 사용하세요.
		long sumPriceTax = 
				cars
					.stream()
					.mapToInt(Car::getPrice)
					.reduce(0, (a, b) -> a+(int)(b*1.1f));
		System.out.println(sumPriceTax);
		
		System.out.println("< 문제4 >"); //문제 4.두 개의 리스트를 생성 후 collect를 사용하여 병합하세요.병합된 리스트를 출력하세요.
	}

}

class Car implements Comparable<Car> {
	public enum Company {
		KIA, HYUNDAI, SSANGYONG
	}
	
	private String title;
	private int price;
	private Company company;
	
	public Car(String title, int price, Company company) {
		this.title = title;
		this.price = price;
		this.company = company;
	}
	public String getTitle() {
		return title;
	}	
	public int getPrice() {
		return price;
	}
	public Company getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price + ", company=" + company + "]";
	}
	
	@Override
	public int compareTo(Car c) {
		return title.compareTo(c.title);
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car))
			return false;
		Car c = (Car)o;
		return title.equals(c.getTitle()) && (price == c.price) && company.equals(c.getCompany());
	}
}
/*
문제 1.
자동차 금액의 평균가를 출력하세요.
문제 2.
가장 높은 자동차의 금액을 출력하세요.
문제 3.
세금 10% 부가된 자동차 가격 총액을 출력하세요.
힌트) reduce를 사용하세요.
문제 4.
두 개의 리스트를 생성 후 collect를 사용하여 병합하세요.
병합된 리스트를 출력하세요.
*/