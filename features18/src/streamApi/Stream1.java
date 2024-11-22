package streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
	
	public static void main(String[] args) {
	// Approach 1 to create stream object	
	Stream<Integer> stream1 = Stream.of(1,2,3,4,5);	
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("mohan");
	names.add("sunil");
	names.add("raju");
	names.add("siva");
	names.add("sam");
	names.add("siri");
	
	// Approach 2 to create stream object	
	Stream<String> stream2= names.stream();
	
	
	}

}
