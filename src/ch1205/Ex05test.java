package ch1205;

import java.util.Scanner;

public class Ex05test {
	
	public static void main(String[] args) {
		while(true) {
			User1 user = null;
			
			user = Drink.form();
			Drink.buy(user);
			
			if(user.isLogin()) {
				Drink.success(user);
				break;
			}
			
			System.out.println("구매를 다시 진행하세요.");
		}
	}

}

class Drink {
	private static final int Coke = 0;
	private static final int Cider = 1;
	private static final int Fanta = 2;
	
	private static final int CokePrice = 500;
	private static final int CiderPrice = 600;
	private static final int FantaPrice = 700;
	
	public static void buy(User1 user) {
		Scanner s = new Scanner(System.in);
		System.out.println("구매하실 음료를 선택하세요\n콜라 - 0\n사이다 - 1\n환타 - 2");
		
		user.setNum(s.nextInt());
		try {
			if(!(user.getNum() >= 0 && user.getNum() <= 2)){
				throw new NumException("없는 음료번호 입니다.");
				
			} else if (user.getNum() == Drink.Coke) {
				if(user.getBalance() < Drink.CokePrice) {
				
					throw new PriceException("잔액이 부족합니다.");
				} else {
					user.setBalance(user.getBalance() - Drink.CokePrice);
					user.setLogin(true);
				}
			} else if (user.getNum() == Drink.Cider) {
				if(user.getBalance() < Drink.CiderPrice) {
					throw new PriceException("잔액이 부족합니다.");
				} else {
					user.setBalance(user.getBalance() - Drink.CiderPrice);
					user.setLogin(true);
				}
			} else if (user.getNum() == Drink.Fanta) {
				if(user.getBalance() < Drink.FantaPrice) {
					throw new PriceException("잔액이 부족합니다.");
				} else {
					user.setBalance(user.getBalance() - Drink.FantaPrice);
					user.setLogin(true);
				}
			} else {
				user.setLogin(true);
			}
		} catch (NumException e) {
			System.out.println(e.getMessage());
			
		} catch (PriceException e) {
			System.out.println("금액을 더 추가해 주세요.");
			
		} catch (Exception e) {
			System.out.println("잔액을 반환합니다.");
		}
		
	}
	
	public static User1 form() {
		Scanner s = new Scanner(System.in);
		User1 user = new User1();
		
		System.out.println("금액을 투입하여 주십시오.");
		user.setBalance(s.nextInt());
		
		return user;
	}
	
	public static void success(User1 user) {
		System.out.println("구매하였습니다.");
	}
}
class User1 {
	private int num;
	private int balance;
	private boolean login;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean isLogin() {
		return login;
	}
	
	public void setLogin(boolean login) {
		this.login = login;
	}
}

class NumException extends Exception {
	public NumException(String message) {
		super(message);
	}
}

class PriceException extends Exception{
	public PriceException(String message) {
		super(message);
	}
}

/*
문제 1.
음료를 뽑을 수 있는 자판기 프로그램을 만들어 주세요.
제공되는 음료 외의 번호 입력 시 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
잔액이 부족할 경우 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
각각의 예외 발생에 대해 예외처리하는 코드를 작성해 주세요.
*/