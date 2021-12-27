package interface2;

import interfaces.ParentClass;


public class Parent2 extends ParentClass  {
	public static void main(String [] args) {
		ParentClass pr= new Parent2();
pr.m1();
m2();
pr.m3();
	}

	@Override
	public void m3() {
	System.out.println("m3 is running");
	
		// TODO Auto-generated method stub
		
	}

}
