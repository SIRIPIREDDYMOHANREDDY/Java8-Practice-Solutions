package streamApi;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
	public static void main(String[] args) {
		
		
List<String> names = Arrays.asList("Mohan","Anushka","Robert","Anupama","Smith","Ashok");

names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
System.out.println("===================================");
names.stream().filter(i -> i.endsWith("n")).forEach(i -> System.out.println(i));

	}

}
