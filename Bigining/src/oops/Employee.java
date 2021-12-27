package oops;

public class Employee {
	int empid;
	String employeename;
	int salary;
	int deptno;
Employee(int id,String name,int sal,int dpno)
{
	empid=id;
	employeename=name;
	salary=sal;
	deptno=dpno;
}
	void display()
	{
		System.out.println(empid);
		System.out.println(employeename);
		System.out.println(salary);
		System.out.println(deptno);
	}
		public static void main(String [] args) {
			Employee emp1=new Employee(100,"Akshay",30000,30);
			emp1.display();
}
	}
