package exception;

public class ThrowKyword {

	public void m1(int marks) {
		if (marks<=40)
	throw new IllegalArgumentException("failed");
		else 
			System.out.println(" passed exam");
	}

public static void main(String[] args) {
	ThrowKyword th=new ThrowKyword();
	th.m1(41);
}
}
