package features18;

import java.util.function.BiFunction;

public class SumOfTwoInputs {
  public static void main(String[] args) {
	
	  
	  BiFunction<Integer, Integer, Integer> bifunction = (a,b) -> a+b;
	  System.out.println(bifunction.apply(10, 20));
}
}
