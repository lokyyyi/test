package ch2101;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex01ByteStreams {

	public static void main(String[] args) {
		FileInputStream oldIn = null;
		FileOutputStream oldOut = null;
		
		try {
			oldIn = new FileInputStream("./src/ch2101/test.txt");
					//C:\Users\L9A\Documents\work14\test\src
			oldOut = new FileOutputStream("./src/ch2101/out1-fileoutputstream1.txt");
			
			int c;
			while((c = oldIn.read()) != -1) {
				oldOut.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream >");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oldIn != null) oldIn.close();
				if (oldOut != null) oldOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
		try(
				FileInputStream in = new FileInputStream("./src/ch2101/test.txt");
				FileOutputStream out = new FileOutputStream("./src/ch2101/out1-fileoutputstream2.txt");
		){
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream > (try-with-resources)");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(
				BufferedInputStream in = new BufferedInputStream(new FileInputStream("./src/ch2101/test.txt"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./src/ch2101/out1-bufferedoutputstream.txt"))
		){
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< File I/O Stream -> Buffered I/O Stream >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
				BufferedInputStream in = new BufferedInputStream(new FileInputStream("./src/ch2101/test.txt"));
				PrintStream out = new PrintStream(new FileOutputStream("./src/ch2101/out1-printstream.txt"));
		){
			int c;
			while((c = in.read()) != -1) {
				out.println((char)c);
			}
			System.out.println("< FileOutputStream -> PrintStream >");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
