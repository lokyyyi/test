package ch0802;

public class Ex02test {
	
	public static void main(String[] args) {
		Study b1 = new Study();
		b1.room = "수학";
		b1.time = 9;
		
		Study b2 = new Study();
		b2.room = "국어";
		b2.time = 13;
		
		Study b3 = new Study();
		b3.room = "영어";
		b3.time = 15;
		
		Day day = new Day();
		day.putStudy(b1);
		
		Day.print(b1);
		
		day.putStudys(b2, b3);
		
		Day.print(day.afternoon);
		
		Student student = new Student();
		student.name = "짱구";
		student.age = 13;
		
		day.owner = student;
		
		Day.dayInfo(day);
		
		
	}

}
class Day {
	Study morning;
	Study[] afternoon;
	Student owner;
	
	void putStudy(Study morning) {
		this.morning = morning;
	}
	
	void putStudys(Study...afternoon) {
		this.afternoon = afternoon;
	}
	
	static void print(Study morning) {
		System.out.println("- 오전 - ");
		System.out.println(morning.print());
	}
	
	static void print(Study[] afternoon) {
		System.out.println("- 오후 - ");
		if (afternoon != null) {
			for (int i=0; i<afternoon.length; i++) {
				System.out.println(afternoon[i].print());
			}
		}
	}
	
	static void dayInfo(Day day) {
		System.out.println("이 스케쥴표의 주인은 " + day.owner.name + "입니다.");
	}
} 

class Study {
	String room;
	int time;
	
	String print() {
		return room + "학원" + " - " + time + "시";
	}
}

class Student {
	String name;
	int age;
}

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. 
*/
//학원1 학원2 오전오후 학생