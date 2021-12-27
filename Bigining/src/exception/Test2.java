package exception;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(5/0);
		}
		catch(Exception ar) {
			System.out.println("this is reason" + ar.getMessage());
		}
		System.out.println(3);
		System.out.println(4);
	}

}
