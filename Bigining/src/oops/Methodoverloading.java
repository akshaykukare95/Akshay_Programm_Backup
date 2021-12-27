package oops;

public class Methodoverloading {
	void sum(int x,int y, double z)
	{
	int a=x;
	int b=y;
	double c=z;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Methodoverloading mo=new Methodoverloading();
		mo.sum(300,400,10.25);

	}

}
