package polymorfism;

public class Overloading1 {
	public void m1(int a) {
		System.out.println("m1 is running");
	}
	public static void m1(boolean c,int b) {
		System.out.println("m2 is running");

}
	public void m1(float d) {
		System.out.println("m3 is running");
	}
	public static void main(String [] args) {
		m1(true,100);
		Overloading1 ov=new Overloading1();
		ov.m1(20);
	}
	}
