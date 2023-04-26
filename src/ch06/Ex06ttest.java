package ch06;

public class Ex06ttest {

	public static void main(String[] args) {
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d x %d = %-5d", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		int a = 1;
		while(a <= 9) {
			int b = 2;
			while(b <= 9) {
				System.out.printf("%d x %d = %-5d", b, a, b*a);
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
