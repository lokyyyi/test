package ch1204;

import java.io.File;

public class Ex04UncheckedException {
	
	public static void main(String[] args) {
		
		File f = new File("./src/ch1204/hello.txt");
		f.createNewFile();	//Checked Exception
		
		
		int[] arr = {3, 5, 7};
		System.out.println(arr[5]);		//Unchecked Exception
	}

}
