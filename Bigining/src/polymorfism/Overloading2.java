package polymorfism;

public class Overloading2 extends Overloading1 {
	public void m1(int a,boolean k) {
		
	}
	public static void m1(double r,double g) {
		System.out.println("m4 is running");

}
	public static void main(String[] args) {
		m1(20.3,30.2);
		m1(true ,300);
	}
}
