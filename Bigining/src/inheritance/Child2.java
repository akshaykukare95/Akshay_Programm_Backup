package inheritance;

public class Child2 extends Parents {
	public void m5() {
		System.out.println("m5 is running");
	}
	public class Child3 extends Child2{
		public void m6() {
			System.out.println("m6 is running");
			
		}
	}
	public static void main(String[] args) {
	Child2 c	=new Child2();
	c.m5();
	m3();

	
	}

}
