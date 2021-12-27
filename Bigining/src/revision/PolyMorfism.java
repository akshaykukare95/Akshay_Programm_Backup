package revision;

public class PolyMorfism {

	public void m1(int a) {
		System.out.println("m1 is running");
	}
	public  void m1(int a,int c) {
		System.out.println("m2 is running");
	}
	public static void main (String[] args) {
		PolyMorfism aj= new PolyMorfism();
		aj.m1(20,30);
	}
}
