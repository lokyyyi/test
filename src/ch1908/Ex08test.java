package ch1908;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Map;
import java.util.HashMap;

public class Ex08test {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("소나타", 30000));
		cars.add(new Car("k5", 25000));
		cars.add(new Car("코란도", 40000));
		cars.add(new Car("아우디", 50000));
		
		System.out.println(cars);
		
		Optional<Car> c1 = Optional.empty();
		
		/*CarNum cn1 = new CarNum();
		
		cn1.setCar(c1);
			
			String non = 
				Optional
					.ofNullable(c1)
					.flatMap(CarNum::getCar)
					.map(Car::getTtile)
					.orElse("미입력차량");
			System.out.println(non);*/
			
			
			Car car1 = new Car();
			
			Optional<Car> c2 = Optional.ofNullable(car1);
			
			CarNum cn1 = new CarNum();
			
			cn1.setCar(c2);
			
			String non = 
					Optional
						.ofNullable(cn1)
						.flatMap(CarNum::getCar)
						.map(Car::getTitle)
						.orElse("미입력차량");
			System.out.println(non);
			
			
	}

}
class CarNum {
	
	private Optional<Car> car;
	
	public Optional<Car> getCar(){
		return car;
	}
	
	public void setCar(Optional<Car> car) {
		this.car = car;
	}
}

class Car {
	private String title;
	private int price;
	
	public Car() {
	}
	
	public Car(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "[title =" + title + ", price =" + price; 
	}
	
}