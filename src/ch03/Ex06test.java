package ch03;

public class Ex06test {

	public static void main(String[]args) {
		
		boolean tvPower = false;
		tvPower = !tvPower;
		System.out.println(tvPower);
		
		boolean result = true;
		System.out.printf("TV의 전원이 꺼져있습니다(%b)%n", result);
		System.out.printf("TV의 전원이 꺼져있습니다(%b)%n", !result);
		System.out.printf("TV의 전원이 꺼져있습니다(%b)%n", !!result);
		System.out.printf("TV의 전원이 꺼져있습니다(%b)%n", !!!result);
	}
}
/*
문제 1.
티비의 전원이 꺼져 있습니다.
부정 연산자를 사용하여 티비의 전원 변수의 값을 반대로 바꿔 저장한 뒤 출력하세요.  
*/