package javapracticeprogramm;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example4 {
	public static void main(String [] args) {
		int a[]= {12,55,26,8,66,74,89,5,6,78,559,9,5};
		TreeSet tr	= new TreeSet();
		for(int str1:a)
			tr.add(str1);
		ArrayList ar= new ArrayList(tr);
		System.out.println("the 2nd largest number :" + ar.get(ar.size()-2));
		System.out.println("the 2nd lowest number :" + ar.get(0));
			
			
		}
	
	} 

