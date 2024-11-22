package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream11 {
	public static void main(String[] args) {
		
		
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Mohan", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Smith", "AUSTRALIA");
		Person p6 = new Person("sunil", "INDIA");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		System.out.println("================================");
		 Optional<Person> findfirst= persons.stream().filter(p -> p.country.equals("INDIA"))
		                .findFirst();
		                 // .findAny
		 if(findfirst.isPresent()) {
			 System.out.println(findfirst.get());
		 }
		 else {
			 System.out.println("person is not there");
		 }
		
		System.out.println("================================");
		
		//Collectors with Stream
		
 
	List<Person> indians=persons.stream()
		.filter(p -> p.country.equals("INDIA"))
		.collect(Collectors.toList());
	    indians.forEach(i -> System.out.println(i));
	    System.out.println("=====================================");
	    
	    // Ex.collect names of persons who are belongs to India and store into names collection
	    
List<String> names = persons.stream()
        .filter(p -> p.country.equals("INDIA"))
        .map(p -> p.name)
        .collect(Collectors.toList());
       // names.forEach(i -> System.out.println(i));
     System.out.println(names);
	    
	    
	    
	    
	    
	    
}
	
}
