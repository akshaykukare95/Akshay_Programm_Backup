package oops;

public class NonstaticMethod {
	public void method1()
	{
		System.out.println("Nonstatic Method m1 is Running");
	}
	public void method2()
	{
method1();
		System.out.println("Nonstatic Method m2 is running");
	}
public static void main(String[] args) {

	NonstaticMethod M=new NonstaticMethod();
	
	M.method2();

}
}
