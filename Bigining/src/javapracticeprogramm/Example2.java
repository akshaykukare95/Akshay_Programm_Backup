package javapracticeprogramm;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40};
		int ar2[]= {50,60,70,80};
		int ar3[]= {10,20,30,40};
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar2, ar3));
		System.out.println(Arrays.equals(ar1, ar3));
	}

}
