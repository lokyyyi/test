package ch1808;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Book b1 = new Book();
		
		while(true) {
			System.out.println("메세지를 입력하세요");
			Message message = new Message(s.nextLine());
			b1.addMessage(message);
			
			if (message.getMessage().equals("quit")) {
				break;
			}
		}
		
		b1.view();
		
	}
}

class Book {
	private Deque<Message> mesStack = new ArrayDeque<>();
	private int currentMesNo;
	
	public Deque<Message> getMesStack(){
		return mesStack;
	}
	
	public void setMesStack(Deque<Message> mesStack) {
		this.mesStack = mesStack;
	}
	
	public void addMessage(Message mes) {
		mesStack.add(mes);
	}
	
	public void view() {
		System.out.println(mesStack.peek());
		mesStack.pop();
		System.out.println(mesStack.peek());
		mesStack.pop();
		System.out.println(mesStack.peek());
		mesStack.pop();
	}
}

class Message { 
	private String message;
	
	/*private void SetMessage(String message) {
		this.message = message;
	}*/
	public Message(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

