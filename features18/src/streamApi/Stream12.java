package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream12 {
	public static void main(String[] args) {
		//Write a java program to get MAX and MIN and AVG salary from given employees data using Stream API
		
		Emp em1 = new Emp(1, "Mohan", 25000.00);
		Emp em2 = new Emp(2, "Robert", 35000.00);
		Emp em3 = new Emp(3, "Ching", 45000.00);
		Emp em4 = new Emp(4, "David", 55000.00);
		Emp em5 = new Emp(5, "Cathy", 45000.00);
		
		List<Emp> list = Arrays.asList(em1,em2,em3,em4,em5);
		
		//Stream<Emp> stream =  Stream.of(em1,em2,em3,em4,em5); // if you are declare this type only one time usage
		
 Optional<Emp> max =list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));     
		 System.out.println("MAX Salary ::" + max.get().salary);
		
	System.out.println("============================================");
	
Optional<Emp> min =list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
System.out.println("MIN Salary ::" +min.get().salary);
		
	System.out.println("==============================================");	
	
	Double  avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
	System.out.println("Avg Salary ::" +avg);
		
		
		
		
		
		
		
	}

}
class Emp{
	int id;
	String name;
	double salary;
	
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
