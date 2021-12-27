package oops;

public class Methods {
	public  void m1()
	{
		System.out.println("Static method M1 is running");
	}
	public static void m2() 
	{

		System.out.println("Static method M2 is running");
	}
	public static void main(String[] args)
	{
	Methods A=new Methods();
	m2();
	A.m1();
	}

}
