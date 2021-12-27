package inheritance;

public class BreakNum {
	public static void main(String [] args){
	outerLoop:	for(int i=0;i<5;i++)
		{
			for(int j=0;j<=5;j++) {
		if (j==4) {
			
		
		break outerLoop;
		}
		System.out.println("inner loop:" +j);
		}
		}
}
}
