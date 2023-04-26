package ch18112;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex1811test {

	public static void main(String[] args) {


		Test t1 = new Test("3월", "A");
		Test t2 = new Test("5월", "B");
		
		Student s1 = new Student("영수");
		s1.addTest(t1);
		s1.addTest(t2);
		
		Group g1 = new Group();
		g1.addStduent(s1);
		
		School sch1 = new School();
		sch1.addGroup("A", g1);
		
		for (Entry<String, Group> e : sch1.getGroup().entrySet()) {
			System.out.println("반이름: " + e.getKey());
			Group tmpGroup = e.getValue();
			for (Student student : tmpGroup.getStudents()) {
				System.out.println("학생이름: " + student.getStdName());
				for (Test t : student.getTestList()) {
					System.out.println("시험 월: " + t.getTestName() + ", 시험 점수: " + t.getScore());
				}
			}
			
		}
		
/*
		test1.add(t1);

		test1.add(t2);


		Test t3 = new Test("3월", "C");

		List<Test> test2 = new ArrayList<>();

		test2.add(t3);



		


		Student s2 = new Student("영희", test2);


		List<Student> student1 = new ArrayList<>();


		student1.add(s1);

		student1.add(s2);


		Group g1 = new Group();
		g1.addGroup("1반", student1);
		
		g1.printGroup();
*/
	}
}
class School {
	private Map<String, Group> groups;
	String name;
	String birthdate;
	
	public School() {
		groups = new HashMap<>();
	}
	
	public void addGroup(String name, Group g) {
		groups.put(name, g);
	}
	
	public Map<String, Group> getGroup() {
		return groups;
	}
}
class Group {

	List<Student> students;

	private String groupName;
	
	public Group() {
		
		students = new ArrayList<>();
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public String getGroupName() {
			return groupName;
	}
	
	public void addStduent(Student std) {
		students.add(std);
	}
	
	/*public void printGroup() {
		for (Entry<String, List<Student>> entry : students.entrySet()) {
			System.out.println(entry.getKey());
			for (Student s : entry.getValue()) {
				System.out.println("< " + s.getStdName() + " >");
				for (Test t : s.getTestList())
					System.out.println("시험 월" + t.getTestName() + ", 시험점수: " + t.getScore());
			}
		}
	}*/
}
class Student {
	
	private List<Test> testList;
	private String stdName;
	
	public Student(String stdName) {
		this.stdName = stdName;
		testList = new ArrayList<>();
	}
	
	public void addTest(Test t) {
		testList.add(t);
	}
	
	public Student(String stdName, List<Test> test) {
		this.stdName = stdName;
		test = new ArrayList<>();
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public List<Test> getTestList(){
		return testList;
	}
	
	
}
class Test {
	private String testName;
	private String score;		
	
	public Test(String testName, String score) {
		this.testName = testName;
		this.score = score;
	}
	public String getTestName() {
		return testName;
	}
	public String getScore() {
		return score;
	}
}
