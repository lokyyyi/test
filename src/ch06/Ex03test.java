package ch06;

public class Ex03test {

	public static void main(String[] args) {
		int[] a = {70, 80, 90, 100, 50};
		
		int min = a[0];
		int max	= a[0];
	
		for (int i=1; i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			else 
				max = a[i];
			}
		System.out.println("최솟값은 " + min + ", 최댓값은 " + max + "입니다.");
	}
		
}

