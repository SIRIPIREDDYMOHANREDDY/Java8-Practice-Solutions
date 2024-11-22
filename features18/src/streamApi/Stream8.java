package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream8 {
	public static void main(String[] args) {
		
		List<String> java = Arrays.asList("core java","adv java","springboot");
		List<String> ui = Arrays.asList("html","css","bs","js");
		
		List<List<String>> cources = Arrays.asList(java,ui);
		
		
    //cources.stream().forEach(c -> System.out.println(c));
		
		System.out.println("========================");
		
	Stream<String> flatMap=	cources.stream().flatMap(s -> s.stream());
		flatMap.forEach(c -> System.out.println(c));
	}

}
