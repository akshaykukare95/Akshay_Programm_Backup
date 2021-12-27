package javapracticeprogramm;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int NumberCheck=155;
		int temp=NumberCheck;
		int reminder=0;
		int result=0;
		
		while(temp!=0) {
			reminder=temp%10;
			result=result+(reminder*reminder*reminder);
			temp=temp/10;
		}
		if(result==NumberCheck)
			System.out.println("this is armstromg number:"+NumberCheck  );
		else
			System.out.println("This is not armstrong number :"+ NumberCheck);
		
	}
	}


