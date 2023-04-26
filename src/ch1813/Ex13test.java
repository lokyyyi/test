package ch1813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
문제 1.
번호와 이름을 가진 학생 클래스를 만드세요.
학생의 번호를 오름차순으로 정렬하여 출력하세요.
번호가 같을 경우 이름을 내림차순으로 정렬하여 출력하세요.
*/
public class Ex13test {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Collections.addAll(list, new Student(1, "A"), new Student(3, "B"), new Student(2, "D"), new Student(3, "C"));
		Collections.sort(list);
		System.out.println(list);
	}

}

class Student implements Comparable<Student> {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Student student) {
		int result = Integer.valueOf(no).compareTo(student.getNo());
		if (result == 0)
			result = name.compareTo(student.getName()) * -1;
		return result;
	}
	
	@Override
	public String toString() {
		return "번호 = " + no + "\t이름 = " + name; 
	}
	
}