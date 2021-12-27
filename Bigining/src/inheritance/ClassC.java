package inheritance;

public class ClassC extends ClassA {
	int p;
	int q;
public void display() {
	System.out.println(p+q);
}
public static void main(String[] args) {
	ClassC cl =new ClassC();
	ClassA cla=new ClassA();
	cla.x=90; 
	cla.y=30;
	cl.p=20;
	cl.q=20;
	cl.display();
	cla.display();

}
}
