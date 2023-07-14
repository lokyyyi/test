package ch2102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex02CharacterStreams {
	
	public static void main(String[] args) {
		try(
				InputStreamReader in = new InputStreamReader(new FileInputStream("src/ch2102/test.txt"));
				OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("src/ch2102/out-inputstreamwriter.txt"));
		){
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< ByteStream -> CharacterStream >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
				FileReader in = new FileReader("src/ch2102/test.txt");
				FileWriter out = new FileWriter("src/ch2102/out-filewriter.txt");
		){ 
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< FileReader / FileWriter >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
				BufferedReader in = new BufferedReader(new FileReader("src/ch2102/test.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("src/ch2102/out-bufferedwriter.txt"));
		){
			String line;
			while((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
			System.out.println("< File Reader/Writer -> Bufferd Reader/Writer >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try (
				BufferedReader in = new BufferedReader(new FileReader("src/ch2102/test.txt"));
				PrintWriter out = new PrintWriter(new FileWriter("src/ch2102/out-printwriter.txt"));
		){
			String line;
			while((line = in.readLine()) != null) {
				out.println(line);
			}
			System.out.println("< FileWriter -> PrintWriter >");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("< FileReader -> Scanner >");
		try (
				Scanner s = new Scanner(new FileReader("src/ch2102/test.txt"));
		){
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("< BufferedReader -> Scanner >");
		try (
				Scanner s = new Scanner(new BufferedReader(new FileReader("src/ch2102/test.txt")));
		){
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
