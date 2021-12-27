package revision;

public class Variables {
int a=10;
static int b=30;

public void m1() {
	int a=20;
	int c=25;
	 int d=30;
	System.out.println(this.a);
	System.out.println(d);
}
public static void main(String[] args) {
	Variables var= new Variables();
	var.m1();
	
}
}
