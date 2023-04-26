package ch1811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
문제 1.
반별 학생 목록을 저장하는 맵을 작성하세요.
학생들은 자신의 모의고사 점수들을 리스트로 갖습니다. 
학생마다 치른 모의고사 횟수는 다를 수 있습니다.
모든 반의 학생과 각 학생이 치른 모의고사들의 점수를 출력하세요.
위의 예제와 같이 클래스를 사용하여 코딩하세요.
*/

public class Ex11test {

	public static void main(String[] args) {
		Test t1 = new Test("3월 모의고사");
		t1.addScore(new Score("국어", 100));
		t1.addScore(new Score("영어", 80));
		t1.addScore(new Score("수학", 90));
		
		Test t2 = new Test("5월 모의고사");
		t2.addScore(new Score("국어", 90));
		t2.addScore(new Score("영어", 80));
		t2.addScore(new Score("수학", 100));
		
		List<Test> student1 = new ArrayList<>();
		student1.add(t1);
		student1.add(t2);
		
		Test t3 = new Test("3월 모의고사");
		t3.addScore(new Score("국어", 90));
		t3.addScore(new Score("영어", 100));
		t3.addScore(new Score("수학", 80));
		
		List<Test> student2 = new ArrayList<>();
		
		Class ban1 = new Class("1반");
		ban1.addBan("철수", student1);
		ban1.addBan("영희", student2);
		
		
		Test t4 = new Test("3월 모의고사");
		t4.addScore(new Score("국어", 70));
		t4.addScore(new Score("영어", 80));
		t4.addScore(new Score("수학", 100));
		
		Test t5 = new Test("5월 모의고사");
		t5.addScore(new Score("국어", 50));
		t5.addScore(new Score("영어", 70));
		t5.addScore(new Score("수학", 70));
		
		List<Test> student3 = new ArrayList<>();
		student3.add(t4);
		student3.add(t5);
		
		Test t6 = new Test("3월 모의고사");
		t6.addScore(new Score("국어", 60));
		t6.addScore(new Score("영어", 40));
		t6.addScore(new Score("수학", 70));
		
		List<Test> student4 = new ArrayList<>();
		student4.add(t6);
		
		Class ban2 = new Class("2반");
		ban2.addBan("둘리", student3);
		ban2.addBan("또치", student4);
		
		School school = new School();
		school.addSchool(ban1);
		school.addSchool(ban2);
		
		school.printAll();
	}
}
class School {
	private List<Class> school;
	
	public void addSchool(Class c) {
		school.add(c);
	}
	
	public void printAll() {
		for(Class ban : school) {
			System.out.println(ban.getClassName());
			for (Entry<String, List<Test>> aa : ban.ban.entrySet()) {
				
			}
		}
}

class Class {
	Map<String, List<Test>> ban;
	private String className;
	
	public Class(String className) {
		ban = new HashMap<>();
		this.className = className;
	}
	
	public String getClassName() {
		return className;
	}
	public void addBan(String banName, List<Test> score) {
		ban.put(banName, score);
	}

}

class Ban {
	private String name;
	
}
class Test {
	private String name;
	private List<Score> scores;
	
	public Test(String name) {
		this.name = name;
		scores = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Score> getScores() {
		return scores;
	}
	
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	
	public void addScore(Score score) {
		scores.add(score);
	}
}

class Score {
	private String name;
	private int score;
	
	
	public Score(String name, int score) {
		this.score = score;
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}

/*
문제 1.
반별 학생 목록을 저장하는 맵을 작성하세요.
학생들은 자신의 모의고사 점수들을 리스트로 갖습니다. 
학생마다 치른 모의고사 횟수는 다를 수 있습니다.
모든 반의 학생과 각 학생이 치른 모의고사들의 점수를 출력하세요.
위의 예제와 같이 클래스를 사용하여 코딩하세요.
*/