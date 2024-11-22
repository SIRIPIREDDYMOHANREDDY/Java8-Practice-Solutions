package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream2 {
public static void main(String[] args) {
	
	
	// regular doing code up to 1.7
	List<Integer> list1 = Arrays.asList(66,32,45,12,20);
	for(int i : list1) {
		if(i>20) {
			System.out.println(i);
		}
	}
	System.out.println("====================");
	//latest Approach after 1.8
	Stream<Integer> stream = list1.stream();
	Stream<Integer> filter=stream.filter(i -> i >20);
	filter.forEach(i -> System.out.println(i));
	System.out.println("======= Simplify===========");
	
	list1.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
	
}
}
