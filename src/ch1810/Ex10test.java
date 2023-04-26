package ch1810;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex10test {
	
	public static void main(String[] args) {
		
		System.out.println("<1반>");
		Map<String, Integer> c1 = new HashMap<>();
		c1.put("A", 40);
		c1.put("B", 50);
		c1.put("C", 55);
		c1.put("D", 60);
		c1.put("E", 100);
		
		Map<String, Integer> c2 = new HashMap<>();
		c2.put("F", 50);
		c2.put("G", 55);
		c2.put("H", 90);
		c2.put("I", 95);
		c2.put("J", 99);
		
		Map<String, Integer> cAll = new HashMap<>();
		cAll.putAll(c1);
		cAll.putAll(c2);
		
		for (Map.Entry<String, Integer> c : cAll.entrySet()) {
			System.out.println("이름: " + c.getKey() + "\t점수: " + c.getValue());	
		}
		
		for(Iterator<String> it = cAll.keySet().iterator(); it.hasNext();) {
			String key = it.next();
			if (cAll.get(key) >= 90) {
				it.remove();
			}
		}
		
		for (Map.Entry<String, Integer> c : cAll.entrySet()) {
			System.out.println("이름: " + c.getKey() + "\t점수: " + c.getValue());	
		}
		
		System.out.println("<문제3>");
		
		Set<Integer> grade = Collections.singleton(55);
		System.out.println(cAll.keySet());
		cAll.values().removeAll(grade);
		System.out.println(cAll.keySet());
		
		System.out.println("<문제4>");
		System.out.println(cAll.containsValue(100));
		
		
	}

}

/*
문제 1.
1반 학생들의 이름, 점수가 저장된 맵과 2반 학생들의 이름, 점수가 저장된 맵을 만드세요.
두 반의 모든 학생들을 중복 없이 출력하세요.
문제 2.
점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요.
문제 3.
55점인 학생 모두 맵에서 삭제하세요.
문제 4.
100점인 학생이 존재하는 지 출력하세요.
*/
