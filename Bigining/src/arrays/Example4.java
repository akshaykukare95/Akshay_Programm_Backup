package arrays;

import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {5,6,8,2,9};
		int c[]= {1,2,3,4,5};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(a,c));
		
	}

}
