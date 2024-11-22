package streamApi;

import java.util.stream.Stream;

public class Stream4 {
public static void main(String[] args) {
	User u1 = new User("Mohan", 24);
	User u2 = new User("Sunil", 30);
	User u3 = new User("Sam", 20);
	User u4 = new User("Raju", 29);
	User u5 = new User("Siri", 15);
	User u6 = new User("Babu", 19);
	
	Stream<User> stream =Stream.of(u1,u2,u3,u4,u5,u6);
	
	stream.filter(u -> u.age >=18).forEach(u -> System.out.println(u));
	System.out.println("=====================");
	
  //stream.filter(u -> u.age >=18 && u.name.startsWith("M")).forEach(u -> System.out.println(u));	
	
	
	
}
}

class User{
	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
  
}
