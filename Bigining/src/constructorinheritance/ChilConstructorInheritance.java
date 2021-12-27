package constructorinheritance;

public class ChilConstructorInheritance extends ParConstructorInheritance {
public ChilConstructorInheritance() {
	super(25);
		System.out.println("child constructor is running");
}
		
	
	public static void main(String[] args) {
		ChilConstructorInheritance ch= new	ChilConstructorInheritance();

	}
	
}
