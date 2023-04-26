package ch1807;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ex07Test {
	
	public static void main(String[] args)	{
		Phone p = new Phone("갤럭시");
		p.addAlarm(new Alarm(0, "알림0"));
		p.addAlarm(new Alarm(1, "알림1"));
		p.addAlarm(new Alarm(2, "알림2"));
		p.addAlarm(new Alarm(3, "알림3"));
		p.addAlarm(new Alarm(4, "알림4"));
		p.addAlarm(new Alarm(5, "알림5"));
		
		p.view();
		p.view();
		p.view();
		p.view();
		p.view();
		
		
		
	}

}

class Phone {
	private String title;
	private Deque<Alarm> alarmStack;
	private List<Alarm> alarmList;
	private int currentAlarmNo;
	
	public Phone(String title) {
		this.title = title;
		this.alarmStack = new ArrayDeque<>();
		this.alarmList = new LinkedList<>();
	}
	
	public void addAlarm(Alarm alarm) {
		alarmStack.push(alarm);
	}
	
	public void view() {
		System.out.println(alarmStack.peek());
		alarmStack.pop();
		/*Alarm alarm = alarmStack.pop();
		currentAlarmNo = alarm.getNo();*/
	}
	
	
	
}

class Alarm {
	private String message;
	private int no;
	
	public Alarm(int no, String message) {
		this.no = no;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return no + "째 알림 - " + message;
	}
	
	
}