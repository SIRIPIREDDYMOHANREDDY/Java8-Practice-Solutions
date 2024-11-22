package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream10 {
	public static void main(String[] args) {
		// Matching operations with stream
		
		
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Mohan", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Smith", "AUSTRALIA");
		Person p6 = new Person("sunil", "INDIA");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		System.out.println("================================");
	
		System.out.println("================================");
		
	 boolean status1 =persons.stream().anyMatch(person ->person.country.equals("INDIA"));
		System.out.println("Any indian Avaible ::" + status1);
		System.out.println("===========================");
		
		boolean status2 =persons.stream().anyMatch(person ->person.country.equals("CANADA"));
		System.out.println("Any canadian Avaible ::" + status2);
		
		System.out.println("=======================================");
		
	boolean status3=persons.stream().allMatch(p -> p.country.equals("INDIA"));
	System.out.println("All persons are Indian Peoples ::" + status3);
	
	System.out.println("========================================");
	
	boolean status4=persons.stream().noneMatch(p -> p.country.equals("MEXCO"));
	System.out.println("No Persons from MEXICO ::" + status4);
		
	}


}
class Person{
	String  name;
	String country;
	
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	
}

