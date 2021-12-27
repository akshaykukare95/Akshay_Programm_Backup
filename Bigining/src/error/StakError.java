package error;

public class StakError {
	public void m1() {
		
		System.out.println("m1 is running");
		m2();
	}
	public void m2() {
	
		System.out.println("m2 is running");
		m1();
	}
	public static void main(String[] args) {
		StakError st	= new StakError();
		st.m2();
	}

}
