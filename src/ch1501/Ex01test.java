package ch1501;

public class Ex01test {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		Integer intgA = Integer.valueOf(a);
		Integer intgB = Integer.valueOf(b);
		
		System.out.println(intgA);
		System.out.println(intgB);
		System.out.println();
		int c = intgA.intValue() + intgB.intValue();
		//int c = Integer.parseInt(Integer.toString(intgC));
		
		System.out.println(c);
		System.out.println();
		if ((intgA.compareTo(intgB)) >= 0) {
			if((intgA.compareTo(intgB)) == 1) {
				System.out.println(intgA);
			}
			else
				System.out.println(intgA + ", " + intgB);
		} else 
			System.out.println(intgB);
		System.out.println();
		
		System.out.println(Integer.max(intgA, intgB));
		System.out.println(Integer.min(intgA, intgB));
		
	}

}
/*
문제 1.
int a = 3;
int b = 7;
Integer intgA;
Integer intgB;
a와 b의 값을 갖는 intgA, intgB를 코딩하세요.
문제 2.
intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.
문제 3.
intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.
문제 4.
intgA 와 intgB의 최소값과 최대값을 구하세요.
힌트) max, min을 사용하세요.
*/