package ch1801;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;			//이게뭔지
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01test {
	
	public static void main(String[] args) {
		
		Set<String> doolly	= new HashSet<>();
		doolly.add("국어");			
		doolly.add("영어");
		
		Set<String> ddochi = new HashSet<>();
		ddochi.add("영어");
		ddochi.add("수학");
		
		Set<String> douner = new HashSet<>();
		douner.add("국어");
		douner.add("수학");
		douner.add("과학");
		
		Set<String> All = new HashSet<>();
		All.addAll(doolly);
		All.addAll(douner);
		System.out.println("-------");
		print(All);
		
	}



public static void print(Collection <String> c) {
	for (String i : c) 
		System.out.println(i + ", ");
	System.out.println();
	}
}

/*
문제 1.
둘리는 국어, 영어 수업을 듣습니다.
또치는 영어, 수학 수업을 듣습니다.
도우너는 국어, 수학, 과학 수업을 듣습니다.
학생들이 수강하는 모든 과목을 중복 없이 출력하세요.
*/