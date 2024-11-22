package features18;

import java.util.ArrayList;

public class NumberSort4 {
public static void main(String[] args) {
	ArrayList<Integer>al = new ArrayList<Integer>();
	al.add(5);
	al.add(3);
	al.add(4);
	al.add(1);
	al.add(2);
	
	
	for(int i =0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	System.out.println("===================");
	
	
	for(int i:al) {
		System.out.println(i);
	}
	System.out.println("=======================");
	
	al.forEach(i -> System.out.println(i));
	
	
}
}
