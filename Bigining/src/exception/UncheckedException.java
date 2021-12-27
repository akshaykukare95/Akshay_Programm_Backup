package exception;

public class UncheckedException {
	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(100/0);
	}
	catch (ArithmeticException ans)
	{
		System.out.println("it is correct");
	}
	finally 
	{
		System.out.println("it is true");
	}
	System.out.println(4);
	System.out.println(5);
	
	
		
	}

}
