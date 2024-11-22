package features18;

import java.util.StringJoiner;

public class StringJoinerDemo {
public static void main(String[] args) {
	StringJoiner sj1 = new StringJoiner("-");  // - is a delimiter
	
	sj1.add("Mohan");
	sj1.add("it");
	sj1.add("java");
	System.out.println(sj1);
	System.out.println("==========");
	
	StringJoiner sj2 = new StringJoiner("-","(",")");  // Delimiter and suffix and prefix
	
	sj2.add("Mohan");
	sj2.add("it");
	sj2.add("java");
	System.out.println(sj2);
}
}
