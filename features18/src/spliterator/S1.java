package spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class S1 {
	public static void main(String[] args) {
		
	List<String> names = Arrays.asList("Mohan","Sunil","Sam","Siri");
	
	Spliterator<String> spl = names.stream().spliterator();
	spl.forEachRemaining(n -> System.out.println(n));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
