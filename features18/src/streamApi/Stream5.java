package streamApi;

import java.util.Arrays;
import java.util.List;

public class Stream5 {

	//mapping
	public static void main(String[] args) {
		
  List<String> names=Arrays.asList("india","usa","uk","japan");	
    // before 
  System.out.println("==================================");
  for(String name :names) {
	  System.out.println(name.toUpperCase());  
  }
  System.out.println("===================================");
  // after
  names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
  
  
  System.out.println("=======================================");
  names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
			
	}
}
