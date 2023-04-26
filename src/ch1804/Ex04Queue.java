package ch1804;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex04Queue {
	
	public static void main(String[] args) {
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		QueueTicketDispenser.takeNum();
		
		System.out.println("첫 번째 손님은 " + Restaurant.firstGuest() + "번 손님입니다.");
		System.out.println();
		
		Restaurant.printQueue();
		
		while (Restaurant.q.size() > 0) {
			Restaurant.serving();
		}
		
		System.out.println();
		
		Restaurant.printQueue();
	}

}

class QueueTicketDispenser {
	private static int num = 1;
	
	public static int takeNum() {
		Restaurant.q.offer(num);
		return num++;
	}
}

class Restaurant {
	public static Queue<Integer> q = new LinkedList<>();
	
	public static void serving() {
		int num = q.poll();
		System.out.println(num + "번 손님에게 서빙되었습니다.");
	}
	
	public static void printQueue() {
		System.out.println("대기열\n-------");
		for (Iterator<Integer> it = q.iterator(); it.hasNext();) {
			int num = it.next();
			
			System.out.println(num + "번 손님");
		}
		System.out.println();
	}
	
	public static int firstGuest() {
		return q.peek();
	}
}