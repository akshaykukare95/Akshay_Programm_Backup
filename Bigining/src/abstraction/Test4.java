package abstraction;

 class Test4 extends Test3 {

	@Override
	void m4() {
		System.out.println("m4 is running");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Test4 ts=new Test4();
		ts.m1();
		ts.m2();
		ts.m3();
		ts.m4();
		m5();
	}

}
