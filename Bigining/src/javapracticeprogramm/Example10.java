package javapracticeprogramm;

public class Example10 {
	public static String RevString(String inp) {
		String rev="";
		for(int j=inp.length()-1;j>=0;j--)
			rev=rev+inp.charAt(j);
		return rev;
	}
	

	
	public static void main(String [] args) {
		String str="avdhut ram shyam vadapav burger lemon";
		String ar[]=str.split(" ");
		for(int i=0;i<ar.length-1;i++) {
			String s1=ar[i];
		ar[i]=RevString(s1);
		}
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i] + " ");
		
	}

}

