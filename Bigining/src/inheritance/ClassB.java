package inheritance;

public class ClassB extends ClassA {
	int a;
	int b;
public void show() {
	System.out.println(a+b);
}
public static void main(String [] args) {
	ClassB b=new ClassB();
	b.x=20;
	b.y=30;
	b.display();
b.a=30;
b.b=60;
b.show();
}
}
