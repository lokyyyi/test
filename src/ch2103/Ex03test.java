package ch2103;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03test {

	public static void main(String[] args) {
		try(
				ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/ch2103/carlist.txt")));
		){
			Car c1 = new Car("소나타", 30000);
			Car c2 = new Car("K5", 40000);
			Parking pk = new Parking();
			pk.add(c1);
			pk.add(c2);
			out.writeObject(pk);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (
				ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/ch2103/carlist.txt")));
		){
			Parking pk = (Parking)in.readObject();
			System.out.println(pk.getCars());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}

class Parking implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Car> cars = new ArrayList<>();
	public void add(Car car) {
		cars.add(car);
	}
	
	public void print() {
		System.out.println(cars);
	}
	
	public List<Car> getCars(){
		return cars;
	}
}
/*
문제 1.
두 대의 차를 주차장에 주차하는 코드를 작성하세요.
주차장 인스턴스를 파일에 쓴 뒤 다시 읽어 와 주차장의 상태를 출력하세요.
*/