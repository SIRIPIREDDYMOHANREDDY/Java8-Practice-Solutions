package streamApi;

import java.util.Arrays;
import java.util.List;

public class Stream6 {
	public static void main(String[] args) {
		
		
List<String> names = Arrays.asList("Mohan","Ashok","Anil","Raju","Rani","John","Akash","Charles");
  // print name with its length which are starting with  'A' using Stream API
 // example for map and filter

System.out.println("================================");
names.stream()
.filter(name -> name.startsWith("A"))
.map(name -> name + "-" + name.length())
.forEach(name -> System.out.println(name));


	}

}
