package ch06;

public class Ex02test {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d  ", i, j, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.printf("%d x %d = %d  ", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		int [][] a = {
				{100, 200},
				{200, 300},
				{300, 200},
		};
		int sum = 0;
		for(int b=0; b<a.length; b++) {
			for(int c=0; c<a[b].length; c++) {
				sum += a[b][c];
				System.out.printf("%d ",a[b][c]);
			}
			System.out.println();
		}
		System.out.printf("%d", sum);
	}
}
