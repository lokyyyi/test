package ch1804;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex04test {

	public static void main(String[] args) {
		Content.takeContent("공지사항1번");
		Content.takeContent("공지사항2번");
		Content.takeContent("공지사항3번");
		Content.takeContent("공지사항4번");
		
		Notice.printQueue();
		System.out.println("-----");
		Notice.remove();
		Notice.remove();
		Notice.printQueue();
		
	}
}
class Content {
	private NoticeName name;
	
	public static void takeContent(String a) {
		Notice.q.offer(a);
	}
}

class Notice {
	public static Queue<String> q = new LinkedList<>();
	
	public static void printQueue() {
		for(Iterator<String> it = q.iterator(); it.hasNext();) {
			String no = it.next();
			System.out.println(no);
		}
	}
	
	public static void remove() {
		q.poll();
	}
	
	
}

enum NoticeName {
	등록, 목록, 삭제
}
/*
문제 1.
공지사항 등록, 목록, 삭제 기능을 코딩하세요.
삭제 시 제일 오래된 공지사항을 삭제하세요.
공지사항의 등록, 목록, 삭제 상수는 enum을 사용하세요.
*/