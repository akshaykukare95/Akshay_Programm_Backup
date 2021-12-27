package javapracticeprogramm;

public class Example9 {
	static int a[]= {12, 15, 35, 44, 77, 88, 957, 74, 58, 66, 88, 54, 55, 666, 52, 58, 2, 8, 2, 8879, 5};
	int temp=0;
	public void sortinglogic() {
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				}
}
	public static void main(String [] args) {
		System.out.println("Befor Sorting");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
		
		
		Example9 sort = new Example9();
		sort.sortinglogic();
		
		System.out.println();
		System.out.println("After sorting Ascending order");
		for (int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		System.out.println("After Sorting Descending Order");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i] +" ");
		
	}
	}