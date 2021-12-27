package revision;

public class Constructor {

	
	public Constructor(int a,int b) {
		
		System.out.println("1st constructor");
	}
	public Constructor() {
		this(20,30);
		System.out.println("2nd constructor");
		
	}
	public static void main(String[] args) {
		Constructor co=new Constructor(20,30);
	}
}
