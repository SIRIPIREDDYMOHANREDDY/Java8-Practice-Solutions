package features18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSort2 {
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(2);
		a1.add(1);
		a1.add(4);
		a1.add(3);
		System.out.println("Before sort::" +a1);
		Collections.sort(a1,new NumberComparator());
		System.out.println("After sort ::" + a1);
		

		Collections.sort(a1,(i,j) -> i.compareTo(j));
		Collections.sort(a1,(i,j) -> i.compareTo(j));
		
	}
	}
	class Num implements Comparator<Integer>{
		@Override
		public int compare(Integer i,Integer j) {
			if(i>j) {
				return -1;
			}
			else if(i<j){
			return 1;	
			}
			return 0;
		}
	}
	
