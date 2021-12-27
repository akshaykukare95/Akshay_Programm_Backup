package interfaces;

public class ChildClass2 implements ParentClass,ChildClass {

	@Override
	public void m1() {
		System.out.println("m1 is implimented");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
	System.out.println("m2 is running"  + ChildClass.d);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String [] args ) {
		ChildClass2 it=new ChildClass2();
		it.m1();
		it.m2();
		ParentClass.m4();
	}

}
