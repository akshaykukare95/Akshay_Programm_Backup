package constructorinheritance;

public class Class1 extends Parent1 {
	public Class1() {
super(20);
		System.out.println("child is calling");
	}
	
public static void main(String [] args) {
	Class1 cl=new Class1();
}
}
