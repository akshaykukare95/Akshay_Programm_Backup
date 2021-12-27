package inheritance;

public class Child extends Parents {
	public static void m4() {
		System.out.println("m4 is running");
		}
public static void main(String [] args) {
	Child Ch=new Child();
	Ch.m1();
Ch.m2();
m3();
m4();
}
}
