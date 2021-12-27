package arrays;

import java.util.Arrays;

public class ArreySortAscending2 {
	public static void main(String[] args) {
		int a[]= {200,105,45,81,1,545,478,65,448,568,48,26,487,48,88825,4,14,45,8,7,8,9,45}; 
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] +"  ");
	}

}
