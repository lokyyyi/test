package ch0710;

public class Ex10test {

	public static void main(String[] args) {
		Cinema b1 = new Cinema("친구", 120, "느와르");
		Cinema.printInfo(b1);
		
		Cinema b3 = new Cinema("괴물", 100);
		Cinema.printInfo(b3);
	}
}

class Cinema{
	String title;
	int time;
	String genre;
	
	Cinema(String title){
		this(title, 0, "액션");
	}
	
	Cinema(String title, int time){
		this(title, time, "로맨스");

	}
	Cinema(String title, int time, String genre){
		this.title = title;
		this.time = time;
		this.genre = genre;
	}
	
	static void printInfo(Cinema ex) {
		System.out.printf("제목 %s%n시간 %d%n장르 %s%n%n", ex.title, ex.time, ex.genre);
	}
	
}
/*
문제 1.
이전 문제에서 작성한 영화 클래스의 생성자를 this를 사용하도록 수정하세요. 
*/