package javapracticeprogramm;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestNum {
	public static void main(String [] args) {
		int a[]= {12,55,26,8,66,74,89,5,6,78,559,9,5};
		TreeSet tr	= new TreeSet();
		for(int al:a)
			tr.add(al);
			
		
		ArrayList ar=new ArrayList(tr);
		System.out.println("2nd largest number is:" +ar.get(ar.size()-2));
System.out.println("2nd lowest number:" + ar.get(1) );
	}

}
