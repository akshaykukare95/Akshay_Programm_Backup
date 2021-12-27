package inheritance;

public class Child2VariableInheritance extends ParentsVariableInheritance {
	public  void m5() {
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String [] args) {
		Child2VariableInheritance b=new Child2VariableInheritance();
		b.m5();
}
}
