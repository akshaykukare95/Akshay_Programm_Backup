package polymorfism;

public class Overriding2 extends Overriding1  {
	public void m1() {
		System.out.println("m3 is running");
	
	}
	
	
		
	
	public static void main(String[] args) {
		
		Overriding1 rd=new Overriding2();
		rd.m1();
	

}
