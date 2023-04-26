package ch1812;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex12test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "K", "I", "H", "L", "J");
		//문제1번
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, "I"));
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		
		List<String> slist = new ArrayList<>(Arrays.asList("A","b"));
		slist.add("c");
		
		System.out.println(slist);
		
		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3};
		
		System.out.println(Arrays.equals(a1, a2));
		
		
		int[][] a3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] a4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(Arrays.equals(a3, a4));
		System.out.println(Arrays.deepEquals(a3, a4));
	}
}
/*
문제 1.
addAll 을 이용해 리스트에 임의의 값들을 입력 후
binarySearch 를 이용해 검색하세요.
오름차순과 내림차순을 적용 후 출력하세요.
문제 2.
Arrays.asList를 이용해 리스트 생성 후 해당 리스트에 임의의 값을 추가하세요.
문제 3.
Arrays.equals 와 Arrays.deepEquals 를 사용하여 1차원 배열과 2차원 배열의 값을 비교하는 코드를 작성하세요.
*/