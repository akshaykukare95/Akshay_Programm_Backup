package oops;

public class ConstructorOverloading {
	double a=0;
	int b=0;
	double c=0;
	ConstructorOverloading()
	{
		a=10.21;
		b=20;
		c=30.25;
	}
	ConstructorOverloading(int z,int y)
	{
		a=z;
		b=y;
	}
	ConstructorOverloading(int z,double y)
	{
		a=z;
		c=y;
	}
	ConstructorOverloading(double z,int y,int x)
	{
		a=z;
		b=y;
		c=x;
	}
	ConstructorOverloading(int x,double y,int z )
	{
		a=x;
		b=z;
		c=y;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		ConstructorOverloading CO=new ConstructorOverloading(30.25,20,10);
		CO.display();
		
	}
	
	}


