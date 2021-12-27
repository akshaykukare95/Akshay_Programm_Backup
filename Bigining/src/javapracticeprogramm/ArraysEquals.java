package javapracticeprogramm;

import java.util.Arrays;

public class ArraysEquals {
public static void main(String[] args) {
	int a1[]= {10,20,30,40,50};
	int a2[]= {60,70,80,90,88};
	int a3[]= {10,20,30,40,50};
	System.out.println(Arrays.equals(a1,a2));
	System.out.println(Arrays.equals(a2,a3));
	System.out.println(Arrays.equals(a1,a3));
	
}
}
