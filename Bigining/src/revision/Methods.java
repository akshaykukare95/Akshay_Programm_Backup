package revision;

public class Methods {

	public static void m1() {
		
		System.out.println("this is m1 method");
	}
	public static void m2() {
		System.out.println("this is m2 method");
		m1();
	}
	public static void main(String[] args) {
		Methods nonstatic=new Methods();
		nonstatic.m1();
		nonstatic.m2();
		
	}

}
