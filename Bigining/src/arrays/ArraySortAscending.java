package arrays;

public class ArraySortAscending {
	public static void main(String[] args) {
		int a[]= {200,105,45,81,1,545,478,65,448,568,48,26,487,48,88825,4,14,45,8,7,8,9,45}; 
		int empty;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;
				}
				
			}
		}
	
for(int i=0;i<a.length;i++)
	System.out.print(a[i] + " ");
	} 
}
