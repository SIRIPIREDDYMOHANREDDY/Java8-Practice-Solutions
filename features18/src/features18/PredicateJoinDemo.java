package features18;



import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;
	
	
	Employee(String name,String location,String dept){
	this.name = name;
	this.location = location;
	this.dept =dept;
		
	}
}

public class PredicateJoinDemo {
public static void main(String[] args) {
	Employee e1 = new Employee("mohan", "chennai", "Devops");
	Employee e2 = new Employee("reddy", "ap", "java");
	Employee e3 = new Employee("sunil", "ban", "testing");
	Employee e4 = new Employee("sam", "ke", "db");
	
	List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
	Predicate<Employee> p1 =(e) ->e.location.equals("ke");
	Predicate<Employee> p2 =(e) ->e.dept.equals("db");
	
	
	//predicate joining
	Predicate<Employee> p =p1.and(p2);
	for(Employee e :emps) {
		if(p.test(e)) {
			System.out.println(e.name);
		}
	}
}
}
