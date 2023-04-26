package ch1809;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex09test {

	public static void main(String[] args) {
		NavigableSet<Integer> score = new TreeSet<>();
		score.add(40);
		score.add(50);
		score.add(60);
		score.add(70);
		score.add(80);
		score.add(83);
		
		
		SortedSet<Integer> six = score.tailSet(60, true);
		
		System.out.println(six);
		System.out.println();
		
		System.out.println(score.floor(100));
		System.out.println();
		
		System.out.println(score.higher(80));
		System.out.println();
		
		System.out.println(score.floor(75));
		
	}
}

/*
문제 1.
60점 이상인 학생들의 점수를 출력하세요. 60점을 포함합니다.
문제 2.
학생들의 시험 점수 중 가장 높은 학생의 점수를 출력하세요.
문제 3.
80점 보다 가장 근접하게 높은 점수를 출력하세요.
문제 4.
75점을 찾아 출력하세요. 없다면 75점 보다 가장 근접하게 낮은 점수를 출력하세요.
*/