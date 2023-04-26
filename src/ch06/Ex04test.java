package ch06;

import java.util.Arrays;

public class Ex04test {
	
	public static void main(String[] args) {
		//int [] lotto = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<lotto.length; i++) {
			int n = (int)(Math.random()*lotto.length);
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;			
		}
		System.out.println(Arrays.toString(lotto));
		
		System.out.println();
		
		for(int i=0; i<6; i++)
			System.out.printf("%d ",lotto[i]);
	}

}
/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요. 
*/