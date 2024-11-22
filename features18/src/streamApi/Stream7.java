package streamApi;

import java.util.stream.Stream;

public class Stream7 {
	// Task: Print employee name with employee age whose salary is >= 50,000 using
	// Stream API
	public static void main(String[] args) {
		Employee e1 = new Employee("Mohan", 23, 15000.00);
		Employee e2 = new Employee("Raju", 24, 35000.00);
		Employee e3 = new Employee("Sunil", 26, 50000.00);
		Employee e4 = new Employee("Sam", 20, 65000.00);
		Employee e5 = new Employee("Siri", 21, 75000.00);

		
		  Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
		  
			
			  stream.filter(employee -> employee.salary >= 50000.00) .forEach(employee ->
			  System.out.println(employee.name +"-"+employee.age));
			
		  
//		  stream.filter(e -> e.salary >= 50000.00)
//		        .map(e -> e.name + "-" +e.age)
//		        .forEach(e -> System.out.println(e));
		 

	}
}

class Employee {
	String name;
	int age;
	double salary;

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
