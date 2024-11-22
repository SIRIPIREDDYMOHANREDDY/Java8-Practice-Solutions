package streamApi;

import java.util.Arrays;
import java.util.List;

public class Stream9 {
	public static void main(String[] args) {
		// these are Slicing operations with Stream
		List<String> javacources = Arrays.asList("core java","adv java","springboot","rest api","microservices");
		
		javacources.stream().limit(3).forEach(c -> System.out.println(c));
		
		System.out.println("============================");
		
		javacources.stream().skip(3).forEach(c -> System.out.println(c));
		
		
		System.out.println("=============================================");
		
		List<String> names = Arrays.asList("mohan","raja","rani","mohan","guru","raja");
		names.stream().distinct().forEach(n -> System.out.println(n));
	}

}
