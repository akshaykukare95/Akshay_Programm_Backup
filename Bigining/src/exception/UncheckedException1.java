package exception;

public class UncheckedException1 {
	public static void main(String[] args) {
		String s="abcd";
		
		try
		{
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException ex) {
			System.out.println("its process");
	}

	}
}
