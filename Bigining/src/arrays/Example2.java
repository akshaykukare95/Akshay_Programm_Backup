package arrays;

public class Example2 {
public static void main(String[]args) {
	System.out.println("for forword number");
	int a[]= {1,2,3,4,5,6,7};
	for(int i=0;i<a.length;i++)
	System.out.print(a[i] +" ");

System.out.println();
	System.out.println("for reverse number");
	for(int i=a.length-1;i>=0;i--)
		System.out.print(a[i] +" ");

}
}
