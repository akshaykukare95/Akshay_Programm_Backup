package javapracticeprogramm;

import java.util.Arrays;

public class Example8 {
	public static void main (String [] args) {
		int ar[]= {11,55,20,65,98,75,63,45,25,36,92,75};
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i] +" ");
	}

}
