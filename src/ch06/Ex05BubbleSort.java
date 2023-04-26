package ch06;

import java.util.Arrays;
	
public class Ex05BubbleSort {

	public static void main(String[] args) {
		int[] arr = {9, 7, 2, 20, 5};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i< arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

/*i-0 j-1
 *i=1 j=2
 *0,1 0,2 0,3 0,4
 *1,2 1,3 1,4
 *2,3 2,4
 *3,4
 */

