package error;

import java.util.Scanner;

public class AssertionError {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the marks");
		int input=sc.nextInt();
		assert input>=40:"failed";
		System.out.println("mark is" +input);
	}

}
