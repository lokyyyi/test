package ch0801;

public class Ex01test {
	
	public static void main(String[] args) {
		Membership b1 = new Membership();
		b1.level = 1;
		System.out.println("해당회원의 레벨은 " + b1.level + "이며, 등급은 " + b1.getRank()	+ " 입니다.");
		
		System.out.println();
		//b1.printMember();
		//b1.printSysop();
		
		MemberName b2 = new MemberName();
		b2.level = 0;
		System.out.println("해당회원들의 레벨은 " + b2.level + "이며, 등급은 " + b2.getRank() + " 입니다.");
		
		String[] name = {"철수", "영희", "짱구"};
		b2.memberArray = name;
		b2.printMember();
		
		System.out.println();
		//b2.printSysop();
		
		SysopMember b3 = new SysopMember("이건희", "이재융");
		b3.level = 2;
		System.out.println("해당회원들의 레벨은 " + b3.level + "이며, 등급은 " + b3.getRank() + " 입니다.");
		
		b3.printSysop();
		System.out.println();
		//b3.printMember();
	}

}
class Membership {
	int level;
	String rank;
	
	String getRank() {
		if (level > 1) {
			rank = "정회원";
		} else if (level > 0 ) {
			rank = "준회원";
		} else {
			rank = "방문자";
		}
		return rank;
	}
}

class MemberName extends Membership {
	String[] memberArray;
	
	void printMember() {
		System.out.println("멤버목록");
		for (int i=0; i<memberArray.length; i++) {
			System.out.println((i+1) + "번 멤버: " + memberArray[i]);
		}
	}
}

class SysopMember extends Membership {
	String first;
	String second;
	
	SysopMember(String first, String second){
		this.first = first;
		this.second = second;
	}
	
	void printSysop() {
		System.out.println("관리책임(정): " + first + "\n" +  "관리책임(부): " + second);
	}
}
/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/