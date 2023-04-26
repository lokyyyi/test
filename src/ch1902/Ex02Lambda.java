package ch1902;

import java.util.HashMap;
import java.util.Map;

//람다 표현식
public class Ex02Lambda {
	
	public static void main(String[] args) {
		Map<String, User> allUsers = UserService.getUserMap();
		Map<String, User> condUser = null;
		
		condUser = UserService.search(allUsers, new Criteria() {
			@Override
			public boolean where(User user) {
				return user.getAge() < 30;
			}
		});
		
		UserService.printUsers(condUser);
		System.out.println();
		
		condUser = UserService.search(allUsers, u -> u.getAge() > 25);
		UserService.printUsers(condUser);
		System.out.println();
		
		condUser = UserService.search(allUsers, u -> u.getId().startsWith("test"));
		UserService.printUsers(condUser);
		System.out.println();
		
		System.out.println("---- <문제 1번>----");
		condUser = UserService.search(allUsers, u -> u.getLevel() >= 2);
		UserService.printUsers(condUser);
		
		System.out.println("--- <문제 2번> ----");
		Map<String, User> timeUser = null;
		
		timeUser = UserService.timeSearch(allUsers, u -> u.getTime() >= 5 && u.getTime() <= 9);
		UserService.printUsers(timeUser);
	}
	

}


@FunctionalInterface
interface Criteria {
	public abstract boolean where(User user) ;
}

interface Time {
	public abstract boolean time(User user);
}

class UserService {
	private static Map<String, User> userMap;
	
	static {
		userMap = new HashMap<>();
		UserService.add("admin", new User("admin", 27, 5, 7));
		UserService.add("test1", new User("test1", 30, 4, 10));
		UserService.add("test2", new User("test2", 22, 3, 8));
		UserService.add("test3", new User("test3", 19, 2, 3));
		UserService.add("test4", new User("test4", 35, 1, 9));
	}
	
	public static Map<String, User> getUserMap(){
		return userMap;
	}
	
	public static void add(String id, User user) {
		userMap.put(id, user);
	}
	
	public static Map<String, User> search(Map<String, User>users, Criteria c) {
		Map<String, User> condUsers = new HashMap<>();
		
		for(Map.Entry<String, User> entry : users.entrySet()) {
			if (c.where(entry.getValue())) {
				condUsers.put(entry.getKey(), entry.getValue());
			}
		}
		return condUsers;
	}
	
	public static Map<String, User> timeSearch(Map<String, User> users, Time t){
		Map<String, User> timeUsers = new HashMap<>();
		
		for(Map.Entry<String, User> entry : users.entrySet()) {
			if (t.time(entry.getValue())) {
				timeUsers.put(entry.getKey(), entry.getValue());
			}
		}
		return timeUsers;
	}
	
	public static void printUsers(Map<String, User> users) {
		for (Map.Entry<String, User> entry : users.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
}

class User {
	private String id;
	private int age;
	
	private int level;
	private int time;
	
	public User(String id, int age, int level, int time) {
		this.id = id;
		this.age = age;
		this.level = level;
		this.time = time;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", age = " + age + ", level = " + level + ", time = " + time;
	}
}
