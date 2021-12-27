package javapracticeprogramm;

public class Example3 {
public static void main(String[] args) {
	int numbercheck=186;
	int temp=numbercheck;
	int reminder=0;
	int result=0;
	
	while(temp !=0) {
		reminder=temp%10;
		result=result+(reminder*reminder*reminder);
		temp=temp/10;	
	}
	if(result==numbercheck)
		System.out.println("this is armstrong number :" + numbercheck);
	else
		System.out.println("this is not armstrong number:" + numbercheck);
		}
	}


