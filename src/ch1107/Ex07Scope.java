package ch1107;

//변수 유효범위
public class Ex07Scope {
	static int iv = 2;
	
	public static void main(String[] args) {
		System.out.println("메소드 호출 전");
		
		System.out.printf("iv = %d%n", iv);
		//System.out.printf("param = %d%n", param);
		//System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		//System.out.printf("k = %d%n", k);
		System.out.println();
		
		testScope(5);
		
		System.out.println("메소드 호출 후");
		
		System.out.printf("iv = %d%n", iv);
		//System.out.printf("param = %d%n", param);
		//System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		//System.out.printf("k = %d%n", k);
		//System.out.println();		
	}
	
	public static void testScope(int param) {
		System.out.println("메소드 시작");
		
		int local = 7;
		System.out.printf("iv = %d%n", iv);
		System.out.printf("param = %d%n", param);
		System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		//System.out.printf("k = %d%n", k);
		System.out.println();
		
		for (int i=0; i<1; i++) {
			System.out.println("i for 문 시작");
			
			System.out.printf("iv = %d%n", iv);
			System.out.printf("param = %d%n", param);
			System.out.printf("local = %d%n", local);
			System.out.printf("i = %d%n", i);
			//System.out.printf("j = %d%n", j);
			//System.out.printf("k = %d%n", k);
			System.out.println();
			
			for (int j=0; j<1; j++) {
				System.out.println("j for 문 시작");
				
				System.out.printf("iv = %d%n", iv);
				System.out.printf("param = %d%n", param);
				System.out.printf("local = %d%n", local);
				System.out.printf("i = %d%n", i);
				System.out.printf("j = %d%n", j);
				//System.out.printf("k = %d%n", k);
				System.out.println();
				
				if(i == 0) {
					System.out.println("if문 시작");
					
					int k = 7;
					System.out.printf("iv = %d%n", iv);
					System.out.printf("param = %d%n", param);
					System.out.printf("local = %d%n", local);
					System.out.printf("i = %d%n", i);
					System.out.printf("j = %d%n", j);
					System.out.printf("k = %d%n", k);
					System.out.println();
					
					System.out.println("if문 종료");
				}
				
				System.out.printf("iv = %d%n", iv);
				System.out.printf("param = %d%n", param);
				System.out.printf("local = %d%n", local);
				System.out.printf("i = %d%n", i);
				//System.out.printf("j = %d%n", j);
				//System.out.printf("k = %d%n", k);
				System.out.println();
				
				System.out.println("i for문 종료\n");
			}
			
			System.out.printf("iv = %d%n", iv);
			System.out.printf("param = %d%n", param);
			System.out.printf("local = %d%n", local);
			//System.out.printf("i = %d%n", i);
			//System.out.printf("j = %d%n", j);
			//System.out.printf("k = %d%n", k);
			System.out.println();
			
			System.out.println("메소드 종료");
		}
	}

}
