package inheritance;

public class ChildVariableInheritance extends ParentsVariableInheritance {
	int a=50;
	static int b=70;
	public void m3() {
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void m4() {
		System.out.println(b);
System.out.println(ParentsVariableInheritance.b);
		
	
	}
	public static void main(String[] args) {
	ChildVariableInheritance a=new ChildVariableInheritance();
	a.m3();
	m4();
	System.out.println(a.a);

	}
	

}
