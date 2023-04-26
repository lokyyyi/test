package ch1803;

import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03test {
	
	public static void main(String[] args) {
		
		
	/*	List<String> ban1 = new ArrayList<>();
		ban1.add("A");
		ban1.add("B");
		ban1.add("C");
		
		List<String> ban2 = new ArrayList<>();
		ban2.add("C");
		ban2.add("D");
		ban2.add("E");
		
		List<String> ban3 = new ArrayList<>();
		ban3.add("E");
		ban3.add("F");
		ban3.add("G");
		
		List<List<String>> school = new ArrayList<>();
		school.add(ban1);
		school.add(ban2);
		school.add(ban3);
		
		for (List<String> ban : school) {
			for (String name : ban) {
				System.out.println(name);
			}
		}
		Set<List<String>> s1 = new HashSet<>(school);
		
		for (Iterator it = s1.iterator(); it.hasNext();) {
			
		}*/
		
		
		
		
	/*	
		List<Student> studentList1 = new ArrayList<>();
		Student s1 = new Student("홍길동", 19);
		Student s2 = new Student("박찬호", 25);
		
		studentList1.add(s1);
		studentList1.add(s2);
		
		Ban ban = new Ban(1, 1);
		ban
		
		
		
		
		List<Student> studentList2 = new ArrayList<>();
		Student s3 = new Student("둘리", 7);
		Student s4 = new Student("또치", 9);
		
		studentList2.add(s3);
		studentList2.add(s4);*/
				
		
		Student s1 = new Student("홍길동", 19);
		Student s2 = new Student("홍길동", 19);
		Student s3 = new Student("박찬호", 25);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		System.out.println();
		
		Set<Student> set = new HashSet<>(list);
		System.out.println(set);
	}

}
class Ban {
	private int no;
	private int floor;
	private List<Student> studentList = new ArrayList<>();
	
	public Ban(int no, int floor) {
		this.no = no;
		this.floor = floor;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
	
class Student{	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

/*
문제 1.
실행 결과와 구글링을 통해 각 컬렉션의 특징을 정리하세요.
문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.
문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요. 
*/